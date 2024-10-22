package medium;

public class MaxSwap {
    public int maximumSwap(int num) {
        String st = Integer.toString(num);
        int[] arr = new int[st.length()];
        for (int i = 0; i < st.length(); i++) {
            arr[i] = Integer.valueOf(st.charAt(i) - '0');
        }
        int[] max = new int[arr.length];
        for (int i = 0; i < 2; i++) {
            int m = 0;
            int index = 0;
            for (int j = i; j < arr.length; j++) {
                m = Math.max(m, arr[j]);
                if (arr[j] > m) {
                    m = arr[j];
                    index = j;
                }
            }
            arr[index] = m;
            int k = i + 1;
            for (int j = i; j < arr.length; j++) {
                if (j != index) {
                    arr[k++] = arr[j];
                }
            }
        }
            for (int i = 0; i < st.length(); i++) {
                num += num * 10 + max[i];
            }
            return num;

        }
        public static void main (String[]args){
            MaxSwap ms = new MaxSwap();
            System.out.println(ms.maximumSwap(2736));
        }
    }
