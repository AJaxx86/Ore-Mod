package net.mcreator.test;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementstest.ModElement.Tag
public class MCreatorInfuseddiamondpickaxe extends Elementstest.ModElement {
	@ObjectHolder("test:infuseddiamondpickaxe")
	public static final Item block = null;

	public MCreatorInfuseddiamondpickaxe(Elementstest instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1824;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MCreatorInfused_diamondGem.block, (int) (1)));
			}
		}, 1, -3F, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("infuseddiamondpickaxe"));
	}
}
