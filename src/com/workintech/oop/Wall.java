package com.workintech.oop;

public class Wall {

    double height;
    double width;


    public Wall(double height, double width){
        checkWidth(width);
        checkHeight(height);
    }

    public double getWidth (){
        return width;
    }
    public double getHeight (){
        return  height;
    }
    public double setWidth (double a){
            if(a<0){
              return this.width=0;
            }
            return this.width=a;
    }
    public double setHeight (double b){
        if(b<0){
            return this.height=0;
        }
        return this.height=b;
    }
    public double getArea (){
        return width*height;
    }

    public void checkWidth (double width){
        if(width<0){
            this.width=0;
        } else
            this.width=width;
    }

    public void checkHeight (double height){
        if(height<0){
            this.height=0;
        } else
            this.height=height;
    }


    //compilation error => build dahi edemez kodu

    //2. yol
   /* public void setWidth (double width){
        checkWidth(width);
    }
    public void setHeight (double height){
        checkHeight(height);
    }
    public double getArea (){
        return this.width*this.height;
    }

    public void checkWidth (double width){
        if(width<0){
            this.width=0;
        } else
            this.width=width;
    }
    public void checkHeight (double height){
        if(height<0){
            this.height=0;
        } else
            this.height=height;
    }*/
}
