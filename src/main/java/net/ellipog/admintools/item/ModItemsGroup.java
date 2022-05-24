package net.ellipog.admintools.item;

import net.ellipog.admintools.AdminTools;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemsGroup {

    public static final ItemGroup ADMINTOOLS = FabricItemGroupBuilder.build(new Identifier(AdminTools.MOD_ID, "admintools"),
            () -> new ItemStack(ModItems.CHORUS_STICK));

}