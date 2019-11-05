package com.jdld.tm;

import com.Proxy.CommonProxy;
import com.jdld.tm.util.Reference;
import com.jdld.tm.util.Util;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME,modid = Reference.MODID,version = Reference.VERSION)//mod入口
public class Main {
    @Instance
    public static Main instance = new Main();//mod入口实例
    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS,clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;//不同服务端执行不同指令
//事件
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){//
        Util.logger=event.getModLog();
        Util.logger.warn("It's preInit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event){//
        Util.logger.warn("It's init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        Util.logger.warn("It's postInit");
    }
}
