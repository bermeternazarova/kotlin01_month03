package com.example.kotlin01_month03

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var et1 = findViewById<EditText>(R.id.et1)
         var et2 = findViewById<EditText>(R.id.et2)
         var tv = findViewById<TextView>(R.id.tv)
         var btn1 = findViewById<Button>(R.id.plus)
         var btn2 = findViewById<Button>(R.id.minus)
         var btn3 = findViewById<Button>(R.id.multiplication)
         var btn4 = findViewById<Button>(R.id.drouble)

        btn1.setOnClickListener(View.OnClickListener {
            var num1 = et1.text.toString().toInt()
            var num2=et2.text.toString().toInt()
            var number=num1+num2
            tv.text=number.toString()
        })
       btn2.setOnClickListener(View.OnClickListener {
           var num1 = et1.text.toString().toInt()
           var num2=et2.text.toString().toInt()
           var number=num1-num2
           tv.text=number.toString()
       })
        btn3.setOnClickListener(View.OnClickListener {
            var num1 = et1.text.toString().toInt()
            var num2=et2.text.toString().toInt()
            var number=num1*num2
            tv.text=number.toString()
        })
        btn4.setOnClickListener(View.OnClickListener {
            try { var num1 = et1.text.toString().toInt()
                var num2=et2.text.toString().toInt()
                var number=num1/num2
                tv.text=number.toString()
            }catch (e :Exception ){
                Toast.makeText(applicationContext, "Hа ноль делить нельзя", Toast.LENGTH_SHORT) .show()
            }
        })
    }
}

//objects and classes
// var student1=Student("Keremet",20,"Andoid")

//arraylist
//var students:java.util.ArrayList<Student>
//students.add(student1)

//String name="jhjdhfk";
//var  name= "hello"
//print(name)

//final String name="indira;
//val mama ="Indira"

//условные операторы if else
//        var num =2
//        var num2= 3
//        if (num>num2){
//            print("error")
//        }else{
//            print("no error")
//        }
//        //switch
//        val random=(0..5).random()//random
//
//        when(random){
//            1-> print("a")
//            2-> print("b")
//            3-> print("c")
//            4-> print("d")
//            5-> print("e")
//            else->{
//                print("исло больше 5")
//
//            }}
//arrays
//        var numbers = IntArray(4)
//        numbers [0]=1
//        numbers [1]=2
//        numbers [2]=3
//
//        //циклы
//        for (i in 1..3){
//            print(i)
//        }
//        for (i in numbers.indices){
//            print("sguare${i}=${i*1}")
//        }
//методы public void
//     fun sum(){}
//
//    //public int sum3
//    fun sum2():Int{return 0}
//
//    // с входяшими параметрами
//    fun sum(number1:Int,number2:Int){}

//   class Student(name :String,age:Int,direction:String):Info{
//       override fun showIn(){
//           print("name")
//       }
//   }
//   interface  Info{
//       fun showIn()
//   }
