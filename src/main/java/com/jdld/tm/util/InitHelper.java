package com.jdld.tm.util;

import com.jdld.tm.Init.ModItems;
import com.jdld.tm.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//物品注册接口
public class InitHelper {
    public static void itemInit(Item item,String name,CreativeTabs tab){
        item.setUnlocalizedName(name);//多元化，方便汉化
        item.setRegistryName(name);//注册mod
        item.setCreativeTab(tab);//在创造模式中属于，那个物品栏
        ModItems.ITEM.add(item);//当该类实例化时，自动添加到数组内
    }
    public static void itemModelRegistry(Item item){
        Main.proxy.registryModel(item,0,"inventory");//0位注册时的顺序权重
    }
}
