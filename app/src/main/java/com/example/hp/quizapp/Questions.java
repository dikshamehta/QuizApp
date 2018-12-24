package com.example.hp.quizapp;

public class Questions {
    private String allquestions[]={
            "Which element was used by Tony Stark to build Arc reactor in cave",
            "How many tons can Iron Man's suit lift when fully powered?",
            "Who does Iron Man creator Stan Lee say Tony Stark is based on?",
            "What is Pepper's full name?",
            "What was the name of the terrorist group that kidnapped Tony stark?"
    };
    private String alloptions[][]={
            {"Platinum","Vibranium","Palladium"},
            {"above 100","below 100","Exactly 150"},
            {"Robert Downey Jr","Howard Hughes","Elon Musk"},
            {"Maria Pepper Potts","Virgina Pepper Potts","Gwyneth Pepper Potts"},
            {"Ten Rings","five Rings","fifteen Rings"}
    };
    private String correctoption[]=
            {"Palladium","above 100","Howard Hughes","Virgina Pepper Potts","Ten Rings"};

    public String getQuestions(int a)
    {
        String ques = allquestions[a];
        return ques;
    }
    public String getOption0(int a)
    {
        String opt = alloptions[a][0];
        return opt;
    }
    public String getOption1(int a)
    {
        String opt = alloptions[a][1];
        return opt;
    }
    public String getOption2(int a)
    {
        String opt = alloptions[a][2];
        return opt;
    }
    public String getCorrectOption(int a)
    {
        String optn = correctoption[a];
        return optn;
    }
}
