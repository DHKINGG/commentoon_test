package com.example.commentoon_test

import android.os.Bundle
import com.example.commentoon_test.config.BaseActivity
import com.example.commentoon_test.databinding.ActivityMainBinding
import com.example.commentoon_test.home.HomeFragment
import com.example.commentoon_test.mypage.MyPageFragment
import com.example.commentoon_test.ranking.RankingFragment
import com.example.commentoon_test.search.SearchFragment

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction().replace(R.id.main_frm, HomeFragment()).commitAllowingStateLoss()

        binding.mainBtmNav.run {
            setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.menu_main_btm_nav_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HomeFragment())
                            .commitAllowingStateLoss()

                    }
                    R.id.menu_main_btm_nav_search -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, RankingFragment())
                            .commitAllowingStateLoss()

                    }
                    R.id.menu_main_btm_nav_video -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, SearchFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_btm_nav_shop -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MyPageFragment())
                            .commitAllowingStateLoss()
                    }

                }
                true
            }
            selectedItemId = R.id.menu_main_btm_nav_home
        }
    }
}