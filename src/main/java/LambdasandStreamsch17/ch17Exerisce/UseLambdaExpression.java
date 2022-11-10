package LambdasandStreamsch17.ch17Exerisce;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Question 17.6 (a)(b)(c)(d)
public class UseLambdaExpression {
    // Solving the problem using functional interface
    @FunctionalInterface
    interface addNumbers{
        float add(float a, float b);
    }
    public static void main(String[] args) {
        //part a complete
      addNumbers sum=( float  x,float  y)->{
        return x+y;
      };
      sum.add( 3.4F, 5.5F);
      //**************************
        //Part 2 complete
        addNumbers sum1=(x,y)->x+y;
        sum.add(3.2f,44f);
        //******************************
        //part 3 complete
        addNumbers sum2= Float::sum;
        sum2.add(4.3f,55f);
        //***************************

        //Solving the problem using BiFunction
        BiFunction<Float,Float,Float> sum4=(Float x, Float y)->{
            return x+y;
        };
        sum4=(x,y)->x+y;
        sum4=Float::sum;

        // part d using Predicate

        Predicate<Integer> check=x->x/3==0;

        System.out.println( check.test(5));

        ArrayList<Integer> list=new ArrayList<>();
        Supplier<ArrayList<Integer>> listSupplier=ArrayList::new;


    }
}
