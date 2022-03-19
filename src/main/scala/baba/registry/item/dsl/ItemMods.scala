package baba.registry.item.dsl

import baba.datagen.recipe.BabaRecipe
import baba.registry.dsl.ModDecMod
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item

trait ItemMods {
	def recipes(first: Item => BabaRecipe, rest: (Item => BabaRecipe)*): ModDecMod[Item] = new RecipesMod(first :: rest.toList)

	def tags(first: TagKey[Item], rest: TagKey[Item]*) = new ItemTagsMod(first :: rest.toList)
}