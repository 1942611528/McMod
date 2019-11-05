package com.jdld.tm.Init;

import com.jdld.tm.Items.ObsidianIngot;
import com.jdld.tm.Items.armor.ObsidianArmor;
import com.jdld.tm.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.item.ItemArmor.*;

public class ModItems {//实例化物体
    public static List<Item> ITEM = new ArrayList<>();
    //ArmorMaterial-盔甲材质
    public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("obsidian_material",//标识名字
            Reference.MODID+":obsidian",//盔甲渲染
            33, //伤害值
            new int[]{3, 6, 8, 3},//头，身子，裤子，鞋子-相关的防御值
            10,//可以附魔的难度
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, //属于那种材质盔甲音效【如钻石】
            2.0F//盔甲任性
    );
    public static final ObsidianIngot OBSIDIAN_INGOT = new ObsidianIngot("obsidian_ingot");//物品名称
    public static final Item OBSDIAN_HELMET = new ObsidianArmor("obsidian_helmet",//对应名字
            OBSIDIAN_ARMOR_MATERIAL,
            1,//属于模型的哪一个部位-属于那个图层
            EntityEquipmentSlot.HEAD//属于头部盔甲
    );//盔甲头盔
    public static final Item OBSDIAN_CHESTPLATE = new ObsidianArmor("obsidian_chestplate",//对应名字
            OBSIDIAN_ARMOR_MATERIAL,
            1,//属于模型的哪一个部位
            EntityEquipmentSlot.CHEST//属于那个部位盔甲
    );//盔甲身子
    public static final Item OBSDIAN_LEGGINGS = new ObsidianArmor("obsidian_leggings",
            OBSIDIAN_ARMOR_MATERIAL,
            2,
            EntityEquipmentSlot.LEGS
    );//盔甲裤子
    public static final Item OBSDIAN_BOOTS = new ObsidianArmor("obsidian_boots",
            OBSIDIAN_ARMOR_MATERIAL,
            1,
            EntityEquipmentSlot.FEET
    );//盔甲鞋子
}
