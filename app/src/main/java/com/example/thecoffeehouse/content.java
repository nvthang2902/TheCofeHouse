package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class content extends AppCompatActivity {
    RecyclerView recycleuudai, recyclecapnhat,recycle_lover;
    com.example.thecoffeehouse.itemAdapter itemAdapter;

    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        img1= findViewById(R.id.img11);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ds1p = new Intent(content.this,thongbao.class);
                startActivity(ds1p);
            }
        });

        List<item> uudailist = new ArrayList<>();
        uudailist.add(new item("The Coffee House đồng hành cùng bạn \"Go Green\"!","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay", R.drawable.item_5));
        uudailist.add(new item("Top 10 cửa hàng The Coffee House bạn nên trải nghiệm tại Hà Nội","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay", R.drawable.item_4));
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay", R.drawable.item_3));
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay", R.drawable.item_4));
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay", R.drawable.item_1));

        List<item> capnhatlist = new ArrayList<>();
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_5));
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_4));
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_3));
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_4));
        capnhatlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_1));

        List<item>  loverlist = new ArrayList<>();
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_5));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_4));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_3));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_4));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_1));

        setRecycle_uudai(uudailist);
        setRecyclecapnhat(capnhatlist);
        setRecycle_lover(loverlist);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.news);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
//                        startActivity(new Intent(getApplicationContext(),Home.class));
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
                        startActivity(new Intent(getApplicationContext(),store_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),account_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    public void setRecycle_uudai(List<item> itemList ){
        recycleuudai=findViewById(R.id.recycle_uudai);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recycleuudai.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recycleuudai.setAdapter(itemAdapter);
    }
    public void setRecyclecapnhat(List<item> itemList ){
        recyclecapnhat=findViewById(R.id.recycle_capnhat);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recyclecapnhat.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recyclecapnhat.setAdapter(itemAdapter);
    }
    public void setRecycle_lover(List<item> itemList ){
        recycle_lover=findViewById(R.id.recycle_lover);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recycle_lover.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recycle_lover.setAdapter(itemAdapter);
    }
}
