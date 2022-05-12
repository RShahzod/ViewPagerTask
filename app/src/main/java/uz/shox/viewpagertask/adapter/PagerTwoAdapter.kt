package uz.shox.viewpagertask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.shox.viewpagertask.R
import uz.shox.viewpagertask.model.User

class PagerTwoAdapter(private val context: Context, private val users:ArrayList<User>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.user_list,parent,false)

        return Page2ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = users[position]


        if (holder is Page2ViewHolder){
            holder.name.text = user.name
            holder.lastname.text = user.lastName
        }

    }

    override fun getItemCount(): Int {
        return users.size
    }

    class Page2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.name2)
        val lastname = itemView.findViewById<TextView>(R.id.lastName)
    }

}