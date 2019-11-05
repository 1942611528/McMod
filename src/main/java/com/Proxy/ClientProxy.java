package com.Proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

//只在客户端运行的代码
public class ClientProxy extends CommonProxy{
    @Override//重新方法
    public void registryModel(Item item,int meta,String id){//注册模型材质资源，绑定资源的方法
        ModelLoader.setCustomModelResourceLocation(item,meta,new ModelResourceLocation(item.getRegistryName(),id));
    }
}
