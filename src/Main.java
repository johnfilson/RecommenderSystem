import java.util.Arrays;
import java.util.Objects;

public class Main {
    protected static String[] users;
    protected static String[] Roles;
    protected static String[] Selections;
    protected static int[][] ratings;
    protected static String[][] RolesAssignment;

    public static void main(String[] args) {

        Recommender();
    }

    public static void Recommender() {

        users = new String[10];
        Roles = new String[15];
        Selections = new String[15];
        ratings = new int[10][15];
        RolesAssignment = new String[10][15];

        //User Names
        users[0] = "John Filson";
        users[1] = "Paul Summers";
        users[2] = "Peter Jackson";
        users[3] = "Lewis Williams";
        users[4] = "Alsahid Simms";
        users[5] = "James Thomason";
        users[6] = "Alan Walker";
        users[7] = "Joe Cole";
        users[8] = "Sanjay Appan";
        users[9] = "Daniel Smith";

        //User Roles
        Roles[0] = "Developer";
        Roles[1] = "Tester";
        Roles[2] = "Project Manager";
        Roles[3] = "Recruiter";
        Roles[4] = "Business Analyst";
        Roles[5] = "Frontend-Developer";
        Roles[6] = "UX Designer";
        Roles[7] = "User-researcher";
        Roles[8] = "Software Architect";
        Roles[9] = "Database manager";
        Roles[10] = "Strart-up Entrepreneur";
        Roles[11] = "Researcher";
        Roles[12] = "Scrum master";
        Roles[13] = "Investor";
        Roles[14] = "Business owner";

        Selections[0] = "Developer";
        Selections[1] = "Tester";
        Selections[2] = "Project Manager";
        Selections[3] = "Recruiter";
        Selections[4] = "Business Analyst";
        Selections[5] = "Frontend-Developer";
        Selections[6] = "UX Designer";
        Selections[7] = "User-researcher";
        Selections[8] = "Software Architect";
        Selections[9] = "Database manager";
        Selections[10] = "Strart-up Entrepreneur";
        Selections[11] = "Researcher";
        Selections[12] = "Scrum master";
        Selections[13] = "Investor";
        Selections[14] = "Business owner";

        // Role  Assignment for users
        RolesAssignment [0][0] = Roles[0];
        RolesAssignment [1][5]= Roles[5];
        RolesAssignment [2][6]= Roles[6];
        RolesAssignment [3][7]= Roles[7];
        RolesAssignment [4][10]= Roles[10];
        RolesAssignment [5][12]= Roles[12];
        RolesAssignment [6][8]= Roles[8];
        RolesAssignment [7][0]= Roles[0];
        RolesAssignment [8][3]= Roles[3];
        RolesAssignment [9][13]= Roles[13];

        //John Filson the Developer ratings
        ratings[0][4] = 5;
        ratings[0][6] = 5;
        ratings[0][9] = 4;
        ratings[0][7] = 3;
        ratings[0][5] = 3;


        //Paul Summers the Frontend Developers ratings
        ratings[1][4] = 5;
        ratings[1][2] = 5;
        ratings[1][3] = 5;
        ratings[1][5] = 2;
        ratings[1][9] = 1;

        //Peter Jackson the UX Designer ratings
        ratings[2][6] = 3;
        ratings[2][8] = 5;
        ratings[2][3] = 5;
        ratings[2][0] = 4;
        ratings[2][9] = 2;

        //Lewis Williams the User-researcher ratings
        ratings[3][2] = 5;
        ratings[3][8] = 4;
        ratings[3][7] = 1;
        ratings[3][1] = 5;
        ratings[3][5] = 0;


        //Alsahid Simms the Strart-up Entrepreneur
        ratings[4][0] = 5;
        ratings[4][7] = 5;
        ratings[4][9] = 5;
        ratings[4][8] = 1;

        //James Thomason the Scrum Master
        ratings[5][3]= 5;
        ratings[5][0]= 5;
        ratings[5][7]= 4;
        ratings[5][6]= 5;
        ratings[5][4]= 0;


        //Alan Walker the Software Architect
        ratings[6][1]= 1;
        ratings[6][0]=5;
        ratings[6][7]=5;
        ratings[6][4]=4;
        ratings[6][8]=3;


        //Joe Cole the Developer
        ratings[7][2]= 4;
        ratings[7][6]= 5;
        ratings[7][0]= 4;
        ratings[7][1]= 5;
        ratings[7][8]= 2;


        //Sanjay Appan the Recruiter
        ratings[8][0]= 3;
        ratings[8][1]=4;
        ratings[8][5]= 5;
        ratings[8][2]= 2;
        ratings[8][9]= 0;

        //Daniel Smith the Investor
        ratings[9][4]= 5;
        ratings[9][2]= 2;
        ratings[9][8]= 0;
        ratings[9][0]= 3;
        ratings[9][7]= 3;


        for (int i = 0; i < RolesAssignment.length; i++) {
            for (int j = 0; j < Selections.length; j++) {
                if (ratings[i][j] > 3.9) {
                    try {
                        if (!Objects.equals(users[i], users[j])) {
                            System.out.printf("The application recommends that %s, speaks to %s \n", users[i], users[j]);
                        }
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }

    }


    public static void c(String[] sa, int i){
        for (int j = 0; j < sa.length; j++) {
            if(j == i){
                System.out.printf("user %s\n",sa[i]);
            }
        }
        for (int k = 0; k < users.length ; k++) {
            for (int l = 0; l < users.length ; l++) {
                if (ratings[k][l] !=0 ) {
                    if (users[k]!=users[l]){
                    System.out.printf("The application recommends that %s, speaks to %s \n", users[k], users[l]);
                    }
                    else {
                        System.out.printf("Doesn't recommend\n");

                    }
                }
            }
        }



    }



}




