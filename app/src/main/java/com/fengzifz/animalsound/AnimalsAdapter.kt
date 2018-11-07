package com.fengzifz.animalsound

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class AnimalsAdapter(private var activity: Activity, private var items: List<String>) : BaseAdapter() {

    private class ViewHolder(view: View?) {
        var name: TextView? = null

        init {
            this.name = view?.findViewById(R.id.name)
        }
    }

    // 重载 getView
    @SuppressLint("InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View?
        val viewHolder: ViewHolder

        // 如果 convertView 不存在时，使用系统服务的 layout 进行加载 list view
        if (convertView == null) {
            val inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.animals_list, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        // 设置 list view 显示的内容
        viewHolder.name?.text = items[position]

        return view as View
    }

    // 重载 getItem
    override fun getItem(position: Int): String {
        return items[position]
    }

    // 重载 getItemId
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    // 重载 getCount
    override fun getCount(): Int {
        return items.size
    }

}