package com.example.prm_final_project.Quizs;

import java.util.Arrays;

public class Question {
    public String questionsAnimal[] = {
            "1.Sloths often sleep while:",
            "2.How many hours do giraffes sleep a day?",
            "3.What is the name of animal?",
            "4.How many eyes do most spiders have?",
            "5.Which bird is a symbol for peace?",
            "6.Where is a shrimp’s heart?",
            "7.What animal is said to have 9 lives?",
            "8.Which animal is known as man’s best friend?",
            "9.How many toes does a cat have on each back paw?",
            "10.What do you call an animal that sleeps during the day and is awake at night?"
    };

    public String choicesAnimal[][] = {
            {"Hanging upside down", "Climbing", "Pooping", "Standing up"},
            {"10-15 hours", "3-6 hours", "Less than two hours", "7-9 hours"},
            {"Cheetah", "Tiger", "Lion", "Leopard"},
            {"Two", "Eight", "Elephan", "Nine"},
            {"Chim công", "Chuồn chuồn", "Bồ câu", "Tu hú"},
            {"In its head", "In the morning", "In its home", "On its eyes"},
            {"Snake", "Cats", "Bird", "Lion"},
            {"Buffalo", "Bird", "Butterfly", "Dogs"},
            {"Four", "Five", "Three", "Six"},
            {"Buffalo", "Nocturnal", "Bird", "Butterfly"}
    };

    public String correctAnswerAnimal[] = {
            "Hanging upside down",
            "Less than two hours",
            "Tiger",
            "Eight",
            "Bồ câu",
            "In its head",
            "Cats",
            "Dogs",
            "Four",
            "Nocturnal"
    };
    public String imageQuesAnimal[]={
            "animal1",
            "animal2",
            "animal3",
            "animal4",
            "animal5",
            "animal6",
            "animal7",
            "animal8",
            "animal9",
            "animal10"
    };

    public String getQuestion(int a, String type){
        if(type.equals("animal")) {
            String question = questionsAnimal[a];
            return question;
        }
        if(type.equals("fruit")) {
            String question = questionsFruit[a];
            return question;
        }
        if(type.equals("flower")) {
            String question = questionsFlower[a];
            return question;
        }
        if(type.equals("fun")) {
            String question = questionsFun[a];
            return question;
        }
        return null;
    }
    public String getchoice1(int a, String type){
        if(type.equals("animal")) {
            String choice = choicesAnimal[a][0];
            return choice;
        }
        if(type.equals("fruit")) {
            String choice = choicesFruit[a][0];
            return choice;
        }
        if(type.equals("flower")) {
            String choice = choicesFlower[a][0];
            return choice;
        }
        if(type.equals("fun")) {
            String choice = choicesFun[a][0];
            return choice;
        }
        return null;
    }

    public String getchoice2(int a,String type){
        if(type.equals("animal")) {
            String choice = choicesAnimal[a][1];
            return choice;
        }
        if(type.equals("fruit")) {
            String choice = choicesFruit[a][1];
            return choice;
        }
        if(type.equals("flower")) {
            String choice = choicesFlower[a][1];
            return choice;
        }
        if(type.equals("fun")) {
            String choice = choicesFun[a][1];
            return choice;
        }
        return null;
    }
    public String getchoice3(int a,String type){
        if(type.equals("animal")) {
            String choice = choicesAnimal[a][2];
            return choice;
        }
        if(type.equals("fruit")) {
            String choice = choicesFruit[a][2];
            return choice;
        }
        if(type.equals("flower")) {
            String choice = choicesFlower[a][2];
            return choice;
        }
        if(type.equals("fun")) {
            String choice = choicesFun[a][2];
            return choice;
        }
        return null;
    }

    public String getchoice4(int a,String type){
        if(type.equals("animal")) {
            String choice = choicesAnimal[a][3];
            return choice;
        }
        if(type.equals("fruit")) {
            String choice = choicesFruit[a][3];
            return choice;
        }
        if(type.equals("flower")) {
            String choice = choicesFlower[a][3];
            return choice;
        }
        if(type.equals("fun")) {
            String choice = choicesFun[a][3];
            return choice;
        }
        return null;
    }

    public String getCorrectAnswer(int a,String type){
        if(type.equals("animal")) {
            String answer = correctAnswerAnimal[a];
            return answer;
        }
        if(type.equals("fruit")) {
            String answer = correctAnswerFruit[a];
            return answer;
        }
        if(type.equals("flower")) {
            String answer = correctAnswerFlower[a];
            return answer;
        }
        if(type.equals("fun")) {
            String answer = correctAnswerFun[a];
            return answer;
        }
        return null;
    }
    public String getImageQues(int a,String type){
        if(type.equals("animal")) {
            String image = imageQuesAnimal[a];
            return image;
        }
        if(type.equals("fruit")) {
            String image = imageQuesFruit[a];
            return image;
        }
        if(type.equals("flower")) {
            String image = imageQuesFlower[a];
            return image;
        }
        if(type.equals("fun")) {
            String image = imageQuesFun[a];
            return image;
        }
        return null;
    }
    public String questionsFruit[] = {
            "1.What is the name of fruit?",
            "2.What is the name of fruit?",
            "3.What is the name of fruit?",
            "4.What is the name of fruit?",
            "5.What is the name of fruit?",
            "6.What is the name of fruit?",
            "7.What is the name of fruit?",
            "8.What is the name of fruit?",
            "9.What is the name of fruit?",
            "10.What is the name of fruit?"
    };

    public String choicesFruit[][] = {
            {"apple", "apricot", "avocado ", "banana"},
            {"blackberry", "blackcurrant", "blueberry", "boysenberry "},
            {"cherry", "coconut", "fig", "grape"},
            {"apple", "apricot", "avocado ", "banana"},
            {"blackberry", "blackcurrant", "blueberry", "boysenberry"},
            {"cherry", "coconut", "fig", "grape"},
            {"grapefruit", "kiwifruit ", "lemon", "lime"},
            {"lychee ", "mandarin", "mango", "melon "},
            {"lychee ", "mandarin", "mango ", "melon "},
            {"lychee ", "mandarin", "mango ", "melon "}
    };

    public String correctAnswerFruit[] = {
            "apple",
            "blueberry",
            "coconut",
            "apricot",
            "blackcurrant",
            "cherry",
            "lemon",
            "mango",
            "melon ",
            "lychee "
    };
    public String imageQuesFruit[]={
            "fruit1",
            "fruit2",
            "fruit3",
            "fruit4",
            "fruit5",
            "fruit6",
            "fruit7",
            "fruit8",
            "fruit9",
            "fruit10"
    };
    public String questionsFlower[] = {
            "1.What is the name of flower?",
            "2.What is the name of flower?",
            "3.What is the name of flower?",
            "4.What is the name of flower?",
            "5.What is the name of flower?",
            "6.What is the name of flower?",
            "7.What is the name of flower?",
            "8.What is the name of flower?",
            "9.What is the name of flower?",
            "10.What is the name of flower?"
    };

    public String choicesFlower[][] = {
            {"Wildflower", "Thistle", "Fern", "Herb"},
            {"Mushroom", "Weed", "Fern", "Cattail"},
            {"Reed", "Bamboo", "Ivy", "Shrub"},
            {"Moss", "Grass", "Palm tree", "Bush"},
            {"Corn", "Tree", "Wildflower", "Thistle"},
            {"Wildflower", "Thistle", "Flower", "Herb"},
            {"Mushroom", "Weed", "Fern", "Cattail"},
            {"Reed", "Bamboo", "Ivy", "Shrub"},
            {"Moss", "Grass", "Palm tree", "Bush"},
            {"Corn", "Tree", "Reed", "Bamboo"}
    };

    public String correctAnswerFlower[] = {
            "Wildflower",
            "Weed",
            "Bamboo",
            "Palm tree",
            "Thistle",
            "Herb",
            "Cattail",
            "Ivy",
            "Grass",
            "Corn"
    };
    public String imageQuesFlower[]={
            "flower1",
            "flower2",
            "flower3",
            "flower4",
            "flower5",
            "flower6",
            "flower7",
            "flower8",
            "flower9",
            "flower10"
    };
    public String questionsFun[] = {
            "1.What is this number?",
            "2.Which one is number TWO?",
            "3.Which glass is the shortest?",
            "4.Result of Subtraction:",
            "5.Result of Subtraction:",
            "6.Result of Addition:",
            "7.Which bird lays the biggest eggs?",
            "8.Which country does spaghetti come from?",
            "9.Which vitamin do oranges contain?",
            "10.What’s the highest mountain in the world?"
    };

    public String choicesFun[][] = {
            {"Seven", "One", "Nine", "Ten"},
            {"2", "4", "5", "8"},
            {"1", "2", "3", "1&3"},
            {"2", "0", "1", "10"},
            {"5", "6", "7", "4"},
            {"3", "6", "8", "10"},
            {"The ostrich", "The cat", "Bird", "Lion"},
            {"Italy", "UK", "USA", "Viet Nam"},
            {"Vitamin A", "Vitamin D", "Vitamin C", "Vitamin B"},
            {"Mount Everest in Nepal", "The Mississippi", "Mount Phu Si", "Mount Ba Vi in Viet Nam"}

    };

    public String correctAnswerFun[] = {
            "Seven",
            "2",
            "2",
            "0",
            "6",
            "8",
            "The ostrich",
            "Italy",
            "Vitamin C",
            "Mount Everest in Nepal"


    };
    public String imageQuesFun[]={
            "fun1",
            "fun2",
            "fun3",
            "fun4",
            "fun5",
            "fun6",
            "fun7",
            "fun8",
            "fun9",
            "fun10"
    };

}
