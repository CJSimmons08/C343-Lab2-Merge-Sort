import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeSort {

    static Node merge(Node A, Node B) {
        int[] array = new int[Utils.length(A) + Utils.length(B)];
        int[] firstHalf = Utils.list_to_array(A);
        int[] secondHalf = Utils.list_to_array(B);
        int i = 0;
        int j = 0;

        for(int k = 0; k != array.length; ++k){
            if(i < firstHalf.length && (j >= secondHalf.length || firstHalf[i] <= secondHalf[j])){
                array[k] = firstHalf[i];
                ++i;
            }
            else if(j < secondHalf.length){
                array[k] = secondHalf[j];
                ++j;
            }
        }

        return Utils.array_to_list(array);
    }

    static Node sort(Node N) {
        if(Utils.length(N) > 1){
            int middle = Utils.length(N) / 2;
            Node firstHalf = sort(Utils.copy_range(N, Utils.drop(N, middle)));
            Node secondHalf = sort(Utils.copy_range(Utils.drop(N, middle), Utils.drop(N, Utils.length(N))));
            return merge(firstHalf, secondHalf);
        }
        else{
            return N;
        }
    }

    static Node merge_in_place(Node A, Node B) {

        if(A == null){
            return B;
        }
        if(B == null){
            return A;
        }

        if(A.data <= B.data){
            A.next = merge_in_place(A.next, B);
            return A;
        }
        else{
            B.next = merge_in_place(A, B.next);
            return B;
        }
    }

    static Node sort_in_place(Node N) {
        if(Utils.length(N) > 1){
            int middle = Utils.length(N) / 2;
            Node middleNode = Utils.drop(N, middle);
            Utils.drop(N, middle - 1).next = null;
            Node firstHalf = sort_in_place(N);
            Node secondHalf = sort_in_place(middleNode);
            N = merge_in_place(firstHalf, secondHalf);
            return N;
        }
        else{
            return N;
        }
    }




}
