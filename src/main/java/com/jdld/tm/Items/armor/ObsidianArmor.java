package com.jdld.tm.Items.armor;

import com.jdld.tm.interfaces.IHasModel;
import com.jdld.tm.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
//盔甲类
public class ObsidianArmor extends ItemArmor implements IHasModel {
    public ObsidianArmor(String name,ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);//后面的参数传入到夫方法中
        InitHelper.itemInit(this,name, CreativeTabs.COMBAT);
    }
    //注册方法
    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}
