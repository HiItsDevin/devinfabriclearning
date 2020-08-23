package dev.hiitsdevin.git.devinfabriclearning;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Devin implements ModInitializer {

	private static final Item BEDROCK_POWDER = new BedrockPowderItem(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(16));
	private static final Item POOF_PLUSHIE = new PoofPlushieDecor(new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(1));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("devin", "bedrock_powder"), BEDROCK_POWDER);
		Registry.register(Registry.ITEM, new Identifier("devin", "poof_plushie"), POOF_PLUSHIE);

		System.out.println("Hello Fabric world!");
	}
}