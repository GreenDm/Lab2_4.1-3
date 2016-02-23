package epam.com;

import java.util.Arrays;

/**
 * Created by Любовь on 23.02.2016.
 */
public class MyMath {

    private static final double PI = 3.14;

        public static void areaOfCircle(int radius){

            double S = PI *(radius*radius);
            System.out.println(S);
        }

        public static void findMax(int...value) {
            Arrays.sort(value);
            int Max = 0;

            for (int element:value) {

                Max = element;
            }
            System.out.println(Max);
        }
        public static void findMin(int...value){
            Arrays.sort(value);
            int Min = value[0];
            System.out.println(Min);

        }
    }

