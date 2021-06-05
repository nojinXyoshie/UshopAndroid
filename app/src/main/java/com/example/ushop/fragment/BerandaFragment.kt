package com.example.ushop.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.ushop.R
import com.example.ushop.adapter.AdapterProduk
import com.example.ushop.adapter.AdapterSlider
import com.example.ushop.model.Produk


class BerandaFragment : Fragment() {

    lateinit var vpSlider : ViewPager
    lateinit var rvProduk: RecyclerView
    lateinit var rvTerlaris: RecyclerView
    lateinit var rvElektronik: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_beranda, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvTerlaris = view.findViewById(R.id.rv_terlaris)
        rvElektronik = view.findViewById(R.id.rv_elektronik)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        rvTerlaris.adapter = AdapterProduk(arrTerlaris)
        rvTerlaris.layoutManager = layoutManager2

        rvElektronik.adapter = AdapterProduk(arrElektronik)
        rvElektronik.layoutManager = layoutManager3

        return view
    }

    val arrProduk: ArrayList<Produk>get() {
        val arr = ArrayList<Produk>()

        val p1 = Produk()
        p1.nama = "Mito"
        p1.harga = "Rp.5.000.000"
        p1.gambar = R.drawable.slider3

        val p2 = Produk()
        p2.nama = "Xiaomi"
        p2.harga = "Rp.5.000.000"
        p2.gambar = R.drawable.slider2

        val p3 = Produk()
        p3.nama = "Cross"
        p3.harga = "Rp.5.000.000"
        p3.gambar = R.drawable.slider1

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

    val arrTerlaris: ArrayList<Produk>get() {
        val arr = ArrayList<Produk>()

        val p1 = Produk()
        p1.nama = "Apple"
        p1.harga = "Rp.5.500.000"
        p1.gambar = R.drawable.slider3

        val p2 = Produk()
        p2.nama = "Samsung"
        p2.harga = "Rp.34.000.000"
        p2.gambar = R.drawable.slider2

        val p3 = Produk()
        p3.nama = "Xiaomi"
        p3.harga = "Rp.12.000.000"
        p3.gambar = R.drawable.slider1

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

    val arrElektronik: ArrayList<Produk>get() {
        val arr = ArrayList<Produk>()

        val p1 = Produk()
        p1.nama = "Apple"
        p1.harga = "Rp.5.500.000"
        p1.gambar = R.drawable.slider3

        val p2 = Produk()
        p2.nama = "Samsung"
        p2.harga = "Rp.34.000.000"
        p2.gambar = R.drawable.slider2

        val p3 = Produk()
        p3.nama = "Xiaomi"
        p3.harga = "Rp.12.000.000"
        p3.gambar = R.drawable.slider1

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

}