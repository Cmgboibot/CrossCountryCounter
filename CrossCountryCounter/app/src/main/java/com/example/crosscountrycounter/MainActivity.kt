package com.example.crosscountrycounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crosscountrycounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var ite : Int = 1
        var j1 : Int = 1
        var a : Int = 0

        binding.team1.setOnClickListener(){

            if ( j1 == 1)
            {
                a += ite
                binding.team1Text1.text = ite.toString()
                binding.team1Total.text = a.toString()
                j1++
                ite++

            }
            else if (j1 == 2)
            {
                a += ite
                binding.team1Text2.text = ite.toString()
                binding.team1Total.text = a.toString()
                j1++
                ite++
            }
            else if (j1 == 3)
            {
                a += ite
                binding.team1Text3.text = ite.toString()
                binding.team1Total.text = a.toString()
                ite++
                j1++
            }
            else if (j1 == 4)
            {
                a += ite
                binding.team1Text4.text = ite.toString()
                binding.team1Total.text = a.toString()
                j1++
                ite++

            }
            else if (j1 == 5)
            {
                a += ite
                binding.team1Text5.text = ite.toString()
                j1++
                ite++
                binding.team1Total.text = a.toString()
            }
            else if (j1 > 5)
            {
                binding.team1Total.text = a.toString()
            }
        }
        var j2 : Int = 1
        var b : Int = 0
        binding.team2.setOnClickListener(){

            if ( j2 == 1)
            {
                b += ite
                binding.team2Text1.text = ite.toString()
                binding.team2Total.text = b.toString()
                j2++
                ite++

            }
            else if (j2 == 2)
            {
                b += ite
                binding.team2Text2.text = ite.toString()
                binding.team2Total.text = b.toString()
                j2++
                ite++
            }
            else if (j2 == 3)
            {
                b += ite
                binding.team2Text3.text = ite.toString()
                binding.team2Total.text = b.toString()
                ite++
                j2++
            }
            else if (j2 == 4)
            {
                b += ite
                binding.team2Text4.text = ite.toString()
                binding.team2Total.text = b.toString()
                j2++
                ite++

            }
            else if (j2 == 5)
            {
                b += ite
                binding.team2Text5.text = ite.toString()
                j2++
                ite++
                binding.team2Total.text = b.toString()
            }
            else if (j2 > 5)
            {
                binding.team2Total.text = b.toString()
            }
        }
        var j3 : Int = 1
        var c : Int = 0
        binding.team3.setOnClickListener(){

            if ( j3 == 1)
            {
                c += ite
                binding.team3Text1.text = ite.toString()
                binding.team3Total.text = c.toString()
                j3++
                ite++

            }
            else if (j3 == 2)
            {
                c += ite
                binding.team3Text2.text = ite.toString()
                binding.team3Total.text = c.toString()
                j3++
                ite++
            }
            else if (j3 == 3)
            {
                c += ite
                binding.team3Text3.text = ite.toString()
                binding.team3Total.text = c.toString()
                ite++
                j3++
            }
            else if (j3 == 4)
            {
                c += ite
                binding.team3Text4.text = ite.toString()
                binding.team3Total.text = c.toString()
                j3++
                ite++

            }
            else if (j3 == 5)
            {
                c += ite
                binding.team3Text5.text = ite.toString()
                j3++
                ite++
                binding.team3Total.text = c.toString()
            }
            else if (j3 > 5)
            {
                binding.team3Total.text = c.toString()
            }
        }
        var j4 : Int = 1
        var d : Int = 0
        binding.team4.setOnClickListener(){

            if ( j4 == 1)
            {
                d += ite
                binding.team4Text1.text = ite.toString()
                binding.team4Total.text = d.toString()
                j4++
                ite++

            }
            else if (j4 == 2)
            {
                d += ite
                binding.team4Text2.text = ite.toString()
                binding.team4Total.text = d.toString()
                j4++
                ite++
            }
            else if (j4 == 3)
            {
                d += ite
                binding.team4Text3.text = ite.toString()
                binding.team4Total.text = d.toString()
                ite++
                j4++
            }
            else if (j4 == 4)
            {
                d += ite
                binding.team4Text4.text = ite.toString()
                binding.team4Total.text = d.toString()
                j4++
                ite++

            }
            else if (j4 == 5)
            {
                d += ite
                binding.team4Text5.text = ite.toString()
                j4++
                ite++
                binding.team4Total.text = d.toString()
            }
            else if (j4 > 5)
            {
                binding.team4Total.text = d.toString()
            }
        }
        var j5 : Int = 1
        var e : Int = 0
        binding.team5.setOnClickListener(){

            if ( j5 == 1)
            {
                e += ite
                binding.team5Text1.text = ite.toString()
                binding.team5Total.text = e.toString()
                j5++
                ite++

            }
            else if (j5 == 2)
            {
                e +=  ite
                binding.team5Text2.text = ite.toString()
                binding.team5Total.text = e.toString()
                j5++
                ite++
            }
            else if (j5 == 3)
            {
                e += ite
                binding.team5Text3.text = ite.toString()
                binding.team5Total.text = e.toString()
                ite++
                j5++
            }
            else if (j5 == 4)
            {
                e += ite
                binding.team5Text4.text = ite.toString()
                binding.team5Total.text = e.toString()
                j5++
                ite++

            }
            else if (j5 == 5)
            {
                e += ite
                binding.team5Text5.text = ite.toString()
                j5++
                ite++
                binding.team5Total.text = e.toString()
            }
            else if (j5 > 5)
            {
                binding.team5Total.text = e.toString()
            }
        }
        var j6 : Int = 1
        var f : Int = 0
        binding.team6.setOnClickListener(){

            if ( j6 == 1)
            {
                f += ite
                binding.team6Text1.text = ite.toString()
                binding.team6Total.text = f.toString()
                j6++
                ite++

            }
            else if (j6 == 2)
            {
                f +=  ite
                binding.team6Text2.text = ite.toString()
                binding.team6Total.text = f.toString()
                j6++
                ite++
            }
            else if (j6 == 3)
            {
                f += ite
                binding.team6Text3.text = ite.toString()
                binding.team6Total.text = f.toString()
                ite++
                j6++
            }
            else if (j6 == 4)
            {
                f += ite
                binding.team6Text4.text = ite.toString()
                binding.team6Total.text = f.toString()
                j6++
                ite++

            }
            else if (j6 == 5)
            {
                f += ite
                binding.team6Text5.text = ite.toString()
                j6++
                ite++
                binding.team6Total.text = f.toString()
            }
            else if (j6 > 5)
            {
                binding.team6Total.text = f.toString()
            }
        }
        var j7 : Int = 1
        var g : Int = 0
        binding.team7.setOnClickListener(){

            if ( j7 == 1)
            {
                g += ite
                binding.team7Text1.text = ite.toString()
                binding.team7Total.text = g.toString()
                j7++
                ite++

            }
            else if (j7 == 2)
            {
                g +=  ite
                binding.team7Text2.text = ite.toString()
                binding.team7Total.text = g.toString()
                j7++
                ite++
            }
            else if (j7 == 3)
            {
                g += ite
                binding.team7Text3.text = ite.toString()
                binding.team7Total.text = g.toString()
                ite++
                j7++
            }
            else if (j7 == 4)
            {
                g += ite
                binding.team7Text4.text = ite.toString()
                binding.team7Total.text = g.toString()
                j7++
                ite++

            }
            else if (j7 == 5)
            {
                g += ite
                binding.team7Text5.text = ite.toString()
                j7++
                ite++
                binding.team7Total.text = g.toString()
            }
            else if (j7 > 5)
            {
                binding.team7Total.text = g.toString()
            }
        }
        var j8 : Int = 1
        var h : Int = 0
        binding.team8.setOnClickListener(){

            if ( j8 == 1)
            {
                h += ite
                binding.team8Text1.text = ite.toString()
                binding.team8Total.text = h.toString()
                j8++
                ite++

            }
            else if (j8 == 2)
            {
                h +=  ite
                binding.team8Text2.text = ite.toString()
                binding.team8Total.text = h.toString()
                j8++
                ite++
            }
            else if (j8 == 3)
            {
                h += ite
                binding.team8Text3.text = ite.toString()
                binding.team8Total.text = h.toString()
                ite++
                j8++
            }
            else if (j8 == 4)
            {
                h += ite
                binding.team8Text4.text = ite.toString()
                binding.team8Total.text = h.toString()
                j8++
                ite++

            }
            else if (j8 == 5)
            {
                h += ite
                binding.team8Text5.text = ite.toString()
                j8++
                ite++
                binding.team8Total.text = h.toString()
            }
            else if (j8 > 5)
            {
                binding.team8Total.text = h.toString()
            }
        }
        var j9 : Int = 1
        var i : Int = 0
        binding.team9.setOnClickListener(){

            if ( j9 == 1)
            {
                i += ite
                binding.team9Text1.text = ite.toString()
                binding.team9Total.text = i.toString()
                j9++
                ite++

            }
            else if (j9 == 2)
            {
                i +=  ite
                binding.team9Text2.text = ite.toString()
                binding.team9Total.text = i.toString()
                j9++
                ite++
            }
            else if (j9 == 3)
            {
                i += ite
                binding.team9Text3.text = ite.toString()
                binding.team9Total.text = i.toString()
                ite++
                j9++
            }
            else if (j9 == 4)
            {
                i += ite
                binding.team9Text4.text = ite.toString()
                binding.team9Total.text = i.toString()
                j9++
                ite++

            }
            else if (j9 == 5)
            {
                i += ite
                binding.team9Text5.text = ite.toString()
                j9++
                ite++
                binding.team9Total.text = i.toString()
            }
            else if (j9 > 5)
            {
                binding.team9Total.text = i.toString()
            }
        }
        var j10 : Int = 1
        var j : Int = 0
        binding.team10.setOnClickListener(){

            if ( j10 == 1)
            {
                j += ite
                binding.team10Text1.text = ite.toString()
                binding.team10Total.text = j.toString()
                j10++
                ite++

            }
            else if (j10 == 2)
            {
                j +=  ite
                binding.team10Text2.text = ite.toString()
                binding.team10Total.text = j.toString()
                j10++
                ite++
            }
            else if (j10 == 3)
            {
                j += ite
                binding.team10Text3.text = ite.toString()
                binding.team10Total.text = j.toString()
                ite++
                j10++
            }
            else if (j10 == 4)
            {
                j += ite
                binding.team10Text4.text = ite.toString()
                binding.team10Total.text = j.toString()
                j10++
                ite++

            }
            else if (j10 == 5)
            {
                j += ite
                binding.team10Text5.text = ite.toString()
                j10++
                ite++
                binding.team10Total.text = j.toString()
            }
            else if (j10 > 5)
            {
                binding.team10Total.text = j.toString()
            }
        }
        binding.Reset.setOnClickListener(){
            j1 = 1
            j2 = 1
            j3 = 1
            j4 = 1
            j5 = 1
            j6 = 1
            j7 = 1
            j8 = 1
            j9 = 1
            j10 = 1
            ite = 1
            a = 0
            b = 0
            c = 0
            d = 0
            e = 0
            f = 0
            g = 0
            h = 0
            i = 0
            j = 0
        binding.team1Text1.text = a.toString()
            binding.team1Text2.text = a.toString()
            binding.team1Text3.text = a.toString()
            binding.team1Text4.text = a.toString()
            binding.team1Text5.text = a.toString()
            binding.team2Text1.text = a.toString()
            binding.team2Text2.text = a.toString()
            binding.team2Text3.text = a.toString()
            binding.team2Text4.text = a.toString()
            binding.team2Text5.text = a.toString()
            binding.team3Text1.text = a.toString()
            binding.team3Text2.text = a.toString()
            binding.team3Text3.text = a.toString()
            binding.team3Text4.text = a.toString()
            binding.team3Text5.text = a.toString()
            binding.team4Text1.text = a.toString()
            binding.team4Text2.text = a.toString()
            binding.team4Text3.text = a.toString()
            binding.team4Text4.text = a.toString()
            binding.team4Text5.text = a.toString()
            binding.team5Text1.text = a.toString()
            binding.team5Text2.text = a.toString()
            binding.team5Text3.text = a.toString()
            binding.team5Text4.text = a.toString()
            binding.team5Text5.text = a.toString()
            binding.team6Text1.text = a.toString()
            binding.team6Text2.text = a.toString()
            binding.team6Text3.text = a.toString()
            binding.team6Text4.text = a.toString()
            binding.team6Text5.text = a.toString()
            binding.team7Text1.text = a.toString()
            binding.team7Text2.text = a.toString()
            binding.team7Text3.text = a.toString()
            binding.team7Text4.text = a.toString()
            binding.team7Text5.text = a.toString()
            binding.team8Text1.text = a.toString()
            binding.team8Text2.text = a.toString()
            binding.team8Text3.text = a.toString()
            binding.team8Text4.text = a.toString()
            binding.team8Text5.text = a.toString()
            binding.team9Text1.text = a.toString()
            binding.team9Text2.text = a.toString()
            binding.team9Text3.text = a.toString()
            binding.team9Text4.text = a.toString()
            binding.team9Text5.text = a.toString()
            binding.team10Text1.text = a.toString()
            binding.team10Text2.text = a.toString()
            binding.team10Text3.text = a.toString()
            binding.team10Text4.text = a.toString()
            binding.team10Text5.text = a.toString()
            binding.team1Total.text = a.toString()
            binding.team2Total.text = a.toString()
            binding.team3Total.text = a.toString()
            binding.team4Total.text = a.toString()
            binding.team5Total.text = a.toString()
            binding.team6Total.text = a.toString()
            binding.team7Total.text = a.toString()
            binding.team8Total.text = a.toString()
            binding.team9Total.text = a.toString()
            binding.team10Total.text = a.toString()
        }

    }
}