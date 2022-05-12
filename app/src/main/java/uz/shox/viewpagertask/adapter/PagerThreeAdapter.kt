package uz.shox.viewpagertask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.shox.viewpagertask.R
import uz.shox.viewpagertask.model.PostData
import uz.shox.viewpagertask.model.User

class PagerThreeAdapter(private val context: Context, private val posts:ArrayList<PostData>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.post_list,parent,false)

        return Page3ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post = posts[position]


        if (holder is Page3ViewHolder){
            holder.name.text = post.name
            holder.postTxt.text = post.postTxt

        }

    }

    override fun getItemCount(): Int {
        return posts.size
    }

    class Page3ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.name3)
        val postTxt = itemView.findViewById<TextView>(R.id.postTxt)
    }

}