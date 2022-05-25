package ch8ClassesAndObjects;

public class Complex {


        private double real;
        private double imaginary;

        public Complex(){
            this.real=0;
            this.imaginary=0;
        }

        public Complex(double real,double imaginary){
            this.real=real;
            this.imaginary=imaginary;
        }

        public double getReal() {
            return real;
        }

        public void setReal(double real) {
            this.real = real;
        }

        public double getImaginary() {
            return imaginary;
        }

        public void setImaginary(double imaginary) {
            this.imaginary = imaginary;
        }

        public Complex add(Complex num){
            double r=this.real+num.real;
            double i=this.imaginary + num.imaginary;
            Complex s= new Complex(r,i);
            return s;

        }

        public Complex sub(Complex num){
            double r= this.real- num.real;
            double i= this.imaginary - num.imaginary;
            Complex s= new Complex(r,i);
            return s;
        }

        public Complex mul(Complex num){
            double r= this.real*num.real - this.imaginary*num.imaginary;
            double i= this.real*num.imaginary+this.imaginary*num.real;

            Complex s=new Complex(r,i);
            return s;
        }

        public Complex div(Complex num){
            double r= this.real/num.real- this.imaginary/num.imaginary;
            double i = this.real/num.imaginary+this.imaginary/num.real;

            Complex s=new Complex(r,i);
            return s;
        }

        public String toString(){
            //double x=this.real + this.imaginary;
            //return " "+x;

            return this.real+" + "+this.imaginary+"i";
        }
    }



