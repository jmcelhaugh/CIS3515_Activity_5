package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.content.Context


class TextSizeAdapter(_context: Context, _numbers: Array<Int>) : BaseAdapter() {

    private val numbers = _numbers
    private val context = _context

    override fun getCount(): Int {
        //TODO("Not yet implemented")
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        //TODO("Not yet implemented")
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        //TODO("Not yet implemented")
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //TODO("Not yet implemented")
        val textView = TextView(context)
        textView.text = numbers[position].toString()
        textView.textSize = numbers[position].toFloat()
        textView.setPadding(5,10,0,5)
        return textView

    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        return super.getDropDownView(position, convertView, parent).apply{
            //didn't fully finish this part, had a bug with code not being in context (aka put
            //after the todo
        }
    }

}