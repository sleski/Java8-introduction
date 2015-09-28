package it.tostao.smp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Slawomir Leski <slawomir.leski@buschgroup.com> on 01.07.2015.
 */
public class StreamCheck {

    @Test
    public void checkIt(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "User","nickname", 1.5f, 1.5f));
        users.add(new User(1, "User","nickname", 1.5f, 1.2f));
        users.add(new User(1, "User","nickname", 1.5f, 1f));
        users.add(new User(1, "User","nickname", 1.5f, 1.6f));
        users.add(new User(1, "User","nickname", 1.5f, 1.3f));
//        int uid = 4;
//        List<User> filteredUsers =users.stream().filter((user) -> user.getId() == uid).limit(2).collect(
//                Collectors.toList());
//        if(filteredUsers.size() > 0){
//            System.out.println(filteredUsers.get(0).toString());
//        }else{
//            System.out.println("no element on list");
//        }

        Comparator<User> byName = Comparator.comparing(user -> user.getUsername());
        Comparator<User> byId = Comparator.comparing(user -> user.getId());
        Comparator<User> byNickname = Comparator.comparing(user -> user.getNickname());
        Comparator<User> bySizeDifferent = Comparator.comparing(user -> user.getPercentage());

//        List<User> sortedUsers = users.stream().sorted(
//                byName.thenComparing(byId).thenComparing(byNickname).thenComparing(bySizeDifferent)).collect(
//                Collectors.toList());
        users.stream().sorted(bySizeDifferent).forEach(System.out::println);

    }
}


 class User {

    @Override
    public String toString() {
//        int percentage = (int) Math.ceil((size - size2) * 100); //
        double diff = (double) size - (double) size2;
        return id + " - " + username + "-" + nickname + "-" + size + "-" + size2 + "-diff- " + diff + "- = " + getPercentage();
    }

    int id;float size, size2;


     public float getPercentage() {
         return (size - size2); //
     }

     public float getSize2() {
         return size2;
     }

     public void setSize2(float size2) {
         this.size2 = size2;
     }

     public float getSize() {
         return size;
     }

     public void setSize(float size) {
         this.size = size;
     }

     String username;
     String nickname;

    public User() {
    }

    public User(int id, String username, String nickname, float size, float size2) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.size = size;
        this.size2 = size2;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

     public String getNickname() {
         return nickname;
     }

     public void setNickname(String nickname) {
         this.nickname = nickname;
     }
 }