package com.jdld.tm.handler;

import com.jdld.tm.Init.ModItems;
import com.jdld.tm.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//静态方法事件处理
@EventBusSubscriber
public class RegistryHandler {//注册管理器
    @SubscribeEvent
    public static void onItemRegistery(RegistryEvent.Register<Item> event){
        //event.getRegistry().register(ModItems.OBSIDIANINGOT);//传入实例
        event.getRegistry().registerAll(ModItems.ITEM.toArray(new Item[0]));//传入数组,并注册
    }
    //监听注册方法[当需要注册模型时]
    @SubscribeEvent
    public static void onModelRegistery(ModelRegistryEvent event){
        for (Item item : ModItems.ITEM){//从注册列表里选出，遍历
            if(item instanceof IHasModel){
                ((IHasModel) item).registryItemRender();
            }
        }
    }
}
