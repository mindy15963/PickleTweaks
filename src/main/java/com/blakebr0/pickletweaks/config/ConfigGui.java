package com.blakebr0.pickletweaks.config;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ConfigGui extends GuiConfig {

    public ConfigGui(GuiScreen parent) {
        super(parent, getConfigElements(), "pickletweaks", false, false, GuiConfig.getAbridgedConfigPath(ModConfigold.config.toString()));
    }
    
    private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<IConfigElement>();
      
       	for (String category : ModConfigold.config.getCategoryNames()) {
       		list.add(new ConfigElement(ModConfigold.config.getCategory(category)));
       	}
        return list;
    }
}
