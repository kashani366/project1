package com.anisa.model.entity;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullname;
    private int age;
    private String phonnumber;
    private String nationalcode;
    private String name;
    private Gender gender;


    public Gender getGender() {
        return Gender.getRandom();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        int random_string_length = 10;
        String[] all_characters = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        int all_characters_length = all_characters.length;

        int min = 0;
        int max = all_characters_length - 1;

        String random_string = "";
        for (int x = 1; x < random_string_length + 1; x = x + 1) {
            Random r = new Random();
            int random_number = r.nextInt(max - min + 1) + min;
            String random_character = all_characters[random_number];
            random_string = random_string + random_character;
        }
        return random_string;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        Random random = new Random();
        age = random.nextInt(100);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonnumber() {
        int random_string_length = 8;
        String[] all_characters = {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"

        };
        int all_characters_length = all_characters.length;

        int min = 0;
        int max = all_characters_length - 1;

        String random_string = "";
        for (int x = 1; x < random_string_length + 1; x = x + 1) {
            Random r = new Random();
            int random_number = r.nextInt(max - min + 1) + min;
            String random_character = all_characters[random_number];
            random_string = random_string + random_character;
        }
        return random_string;
    }

    public void setPhonnumber(String phonnumber) {
        this.phonnumber = phonnumber;
    }

    public String getNationalcode() {
        int random_string_length = 8;
        String[] all_characters = {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"

        };
        int all_characters_length = all_characters.length;

        int min = 0;
        int max = all_characters_length - 1;

        String random_string = "";
        for (int x = 1; x < random_string_length + 1; x = x + 1) {
            Random r = new Random();
            int random_number = r.nextInt(max - min + 1) + min;
            String random_character = all_characters[random_number];
            random_string = random_string + random_character;
        }
        return random_string;
    }

    public void setNationalcode(String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        int random_string_length = 10;
        String[] all_characters = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"

        };
        int all_characters_length = all_characters.length;

        int min = 0;
        int max = all_characters_length - 1;

        String random_string = "";
        for (int x = 1; x < random_string_length + 1; x = x + 1) {
            Random r = new Random();
            int random_number = r.nextInt(max - min + 1) + min;
            String random_character = all_characters[random_number];
            random_string = random_string + random_character;
        }
        return random_string;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", phonnumber='" + phonnumber + '\'' +
                ", nationalcode='" + nationalcode + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
