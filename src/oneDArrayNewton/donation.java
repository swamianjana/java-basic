
//Donation
//Easy
//
//Time Limit: 2 sec
//Memory Limit: 128000 kB
//Problem Statement
//After the decimation, all world went into chaos. People had to 
//rebuild the planet so Shield came up with a donation strategy. They feel 
//all the rich guys need to donate more than the poor guys. So, they make a rule.
//They would make a donation list in which the donation of each person would be shown.
//But the rule is that a person can�t pay less than what has already been paid before them.
//Find the extra amount each person will pay, and also, tell shield the total amount of donation.
//
//Input
//The first line contains n, the total number of people donating. The next line contains n
//space separated integers denoting the amount of money paid by the people. The amounts are
//mentioned in the order in which the people paid.
//
//Constraints:-
//1 <= n <= 100000
//0 <= money <= 100000
//Output
//The first line contains the extra money that each student has to pay
//after their teacher applied the rule. The second line contains the total 
//amount collected by the teacher at the end.
//Example
//Sample Input:-
//10
//1 2 3 2 4 3 6 6 7 6
//
//Sample Output:-
//0 0 0 1 0 1 0 0 0 1
//43
//
//Sample Input:-
//7
//10 20 30 40 30 20 10
//
//Sample Output:-
//0 0 0 0 10 20 30
//220
package oneDArrayNewton;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class donation {
    public static void main (String[] args) {
            Scanner scn = new Scanner(System.in);
            //  Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        long[] arr = new long [N];
        long totalDonation=0L;

        for(int x=0 ; x<arr.length;x++){
            arr[x]=scn.nextInt();
            totalDonation += arr[x];
        }

        long[] newArr = new long [N];
        newArr[0]=0L;
        long least= arr[0];
        for(int y=1;y<arr.length;y++){
            if(arr[y]<least){
                newArr[y] = least - arr[y]; 
            }else{
                newArr[y]=0L;
                least=arr[y];
            }
            totalDonation += newArr[y];
        }
    
        for(int z=0;z<newArr.length;z++){
            System.out.print(newArr[z]+" ");
        }
        System.out.print("\n"+totalDonation+" ");
        
    }
}