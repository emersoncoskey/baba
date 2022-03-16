package net.emersoncoskey.foam.datagen.model.item

import net.emersoncoskey.foam.CbMod
import net.emersoncoskey.foam.datagen.model.CbModel
import net.minecraft.data.DataGenerator
import net.minecraftforge.client.model.generators.{ItemModelBuilder, ItemModelProvider}
import net.minecraftforge.common.data.ExistingFileHelper

case class CbItemModelProvider(
	mod   : CbMod,
	gen   : DataGenerator,
	helper: ExistingFileHelper,
	models: Seq[CbModel[ItemModelBuilder]]
) extends ItemModelProvider(gen, mod.ModId, helper) {
	override def registerModels(): Unit = models.foreach(m => m.act.runS(getBuilder(m.name)))
}
