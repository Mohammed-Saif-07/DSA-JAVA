// Q.5. Rearranging Playlist with High-Energy and Low-Energy Tracks.
// Imagine you're a software engineer working on a mobile application for a music streaming service. As part of the app's functionality, you're tasked with developing a feature that enhances the user experience by rearranging the order of songs in a playlist.

// Your program takes input data representing the order of songs in a playlist. The goal is to rearrange the playlist such that the songs are alternately ordered between high-energy and low-energy tracks, providing users with a dynamic listening experience.

// After processing the input data, your program provides the rearranged playlist, alternating between high-energy and low-energy tracks, thereby improving user engagement and satisfaction with the music streaming app.

// Input Explanation:
// The input consists of two lines.
// The first line contains an integer 'n' representing the number of elements in the array.
// The second line contains 'n' space-separated integers representing the elements of the array.

// Output Explanation:
// The output consists of a single line.
// The line contains 'n' space-separated integers representing the rearranged order of elements in the array after applying the rearrange function.

// Sample Input 1: 
// 6
// 1 2 3 4 5 6
// Sample Output 1:
// 6 1 5 2 4 3

// Sample Input 2: 
// 5
// 10 20 30 40 50
// Sample Output 2: 
// 50 10 40 20 30

package shekhar.st1;

import java.util.*;

public class songPlaylist {
    static void rearrange(int[] arr, int n) {
        int temp[] = arr.clone();
        int small = 0;
        int large = n - 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];
            flag = !flag;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        rearrange(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}