package com.bvs.CollegeApp.gpa;

/**
 * Created by JARVIS on 23-Feb-17.
 **/


class Subject {
    String grade;
    double creditHour;
    double gradePoint;


    Subject()
    {
        grade = "";
        creditHour = 0;
        gradePoint = 0;

    }

    public void setGrade(String g)
    {
        grade = g;
    }

    public void setCreditHour(double ch)
    {
        creditHour = ch;
    }

    void setGradePoint()
    {
        switch (grade) {

            case "100":
                gradePoint = 10.0;
                break;
            case "99":
                gradePoint = 9.9;
                break;
            case "98":
                gradePoint = 9.8;
                break;
            case "97":
                gradePoint = 9.7;
                break;
            case "96":
                gradePoint = 9.6;
                break;
            case "95":
                gradePoint = 9.5;
                break;
            case "94":
                gradePoint = 9.4;
                break;
            case "93":
                gradePoint = 9.3;
                break;
            case "92":
                gradePoint = 9.2;
                break;
            case "91":
                gradePoint = 9.1;
                break;
            case "90":
                gradePoint = 9.0;
                break;
            case "89":
                gradePoint = 8.9;
                break;
            case "88":
                gradePoint = 8.8;
                break;
            case "87":
                gradePoint = 8.7;
                break;
            case "86":
                gradePoint = 8.6;
                break;
            case "85":
                gradePoint = 8.5;
                break;
            case "84":
                gradePoint = 8.4;
                break;
            case "83":
                gradePoint = 8.3;
                break;
            case "82":
                gradePoint = 8.2;
                break;
            case "81":
                gradePoint = 8.1;
                break;
            case "80":
                gradePoint = 8.0;
                break;
            case "79":
                gradePoint = 7.9;
                break;
            case "78":
                gradePoint = 7.8;
                break;
            case "77":
                gradePoint = 7.7;
                break;
            case "76":
                gradePoint = 7.6;
                break;
            case "75":
                gradePoint = 7.5;
                break;
            case "74":
                gradePoint = 7.4;
                break;
            case "73":
                gradePoint = 7.3;
                break;
            case "72":
                gradePoint = 7.2;
                break;
            case "71":
                gradePoint = 7.1;
                break;
            case "70":
                gradePoint = 7.0;
                break;
            case "69":
                gradePoint = 6.9;
                break;
            case "68":
                gradePoint = 6.8;
                break;
            case "67":
                gradePoint = 6.7;
                break;
            case "66":
                gradePoint = 6.6;
                break;
            case "65":
                gradePoint = 6.5;
                break;
            case "64":
                gradePoint = 6.4;
                break;
            case "63":
                gradePoint = 6.3;
                break;
            case "62":
                gradePoint = 6.2;
                break;
            case "61":
                gradePoint = 6.1;
                break;
            case "60":
                gradePoint = 6.0;
                break;
            case "59":
                gradePoint = 5.9;
                break;
            case "58":
                gradePoint = 5.8;
                break;
            case "57":
                gradePoint = 5.7;
                break;
            case "56":
                gradePoint = 5.6;
                break;
            case "55":
                gradePoint = 5.5;
                break;
            case "54":
                gradePoint = 5.4;
                break;
            case "53":
                gradePoint = 5.3;
                break;
            case "52":
                gradePoint = 5.2;
                break;
            case "51":
                gradePoint = 5.1;
                break;
            case "50":
                gradePoint = 5.0;
                break;
            case "49":
                gradePoint = 4.9;
                break;
            case "48":
                gradePoint = 4.8;
                break;
            case "47":
                gradePoint = 4.7;
                break;
            case "46":
                gradePoint = 4.6;
                break;
            case "45":
                gradePoint = 4.5;
                break;
            case "44":
                gradePoint = 4.4;
                break;
            case "43":
                gradePoint = 4.3;
                break;
            case "42":
                gradePoint = 4.2;
                break;
            case "41":
                gradePoint = 4.1;
                break;
            case "40":
                gradePoint = 4.0;
                break;
            case "39":
                gradePoint = 3.9;
                break;
            case "38":
                gradePoint = 3.8;
                break;
            case "37":
                gradePoint = 3.7;
                break;
            case "36":
                gradePoint = 3.6;
                break;
            case "35":
                gradePoint = 3.5;
                break;
            case "34":
                gradePoint = 3.4;
                break;
            case "33":
                gradePoint = 3.3;
                break;
            case "31":
                gradePoint = 3.1;
                break;
            case "30":
                gradePoint = 3.0;
                break;
            case "29":
                gradePoint = 2.9;
                break;
            case "28":
                gradePoint = 2.8;
                break;
            case "27":
                gradePoint = 2.7;
                break;
            case "26":
                gradePoint = 2.6;
                break;
            case "25":
                gradePoint = 2.5;
                break;
            case "24":
                gradePoint = 2.4;
                break;
            case "23":
                gradePoint = 2.3;
                break;
            case "22":
                gradePoint = 2.2;
                break;
            case "21":
                gradePoint = 2.1;
                break;
            case "20":
                gradePoint = 2.0;
                break;
            case "19":
                gradePoint = 1.9;
                break;
            case "18":
                gradePoint = 1.8;
                break;
            case "17":
                gradePoint = 1.7;
                break;
            case "16":
                gradePoint = 1.6;
                break;
            case "15":
                gradePoint = 1.5;
                break;
            case "14":
                gradePoint = 1.4;
                break;
            case "13":
                gradePoint = 1.3;
                break;
            case "12":
                gradePoint = 1.2;
                break;
            case "11":
                gradePoint = 1.1;
                break;
            case "10":
                gradePoint = 1.0;
                break;
            case "9":
                gradePoint = 0.9;
                break;
            case "8":
                gradePoint = 0.8;
                break;
            case "7":
                gradePoint = 0.7;
                break;
            case "6":
                gradePoint = 0.6;
                break;
            case "5":
                gradePoint = 0.5;
                break;
            case "4":
                gradePoint = 0.4;
                break;
            case "3":
                gradePoint = 0.3;
                break;
            case "2":
                gradePoint = 0.2;
                break;
            case "1":
                gradePoint = 0.1;
                break;
        }
    }

    String getGrade()
    {
        return grade;
    }

    double getCreditHour()
    {
        return creditHour;
    }

}
