package com.jdld.tm.Items;

import com.jdld.tm.Init.ModItems;
import com.jdld.tm.Main;
import com.jdld.tm.interfaces.IHasModel;
import com.jdld.tm.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//黑曜石锭类
public class ObsidianIngot extends Item implements IHasModel {
    public ObsidianIngot(String name) {//构造函数
        InitHelper.itemInit(this,name,CreativeTabs.MATERIALS);//使用接口注册
    }
    //注册模型方法,因为很常用所以改为接口IHasModel里
    @Override
    public void registryItemRender(){
        InitHelper.itemModelRegistry(this);//自身传入
    }
}
