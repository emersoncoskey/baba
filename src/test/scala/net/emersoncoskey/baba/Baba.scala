package net.emersoncoskey.baba

import net.emersoncoskey.baba.data.{%:, DNil}
import net.emersoncoskey.baba.modules.TestModule
import net.emersoncoskey.baba.registry.painting.PaintingDec
import net.emersoncoskey.baba.util.{DefaultRegistries, PaintingType}
import net.minecraftforge.fml.common.Mod

/** An example implementation of BaseMod, and the entrypoint for this mod. */
@Mod(Baba._modId)
object Baba extends BaseMod.Default {
	final val _modId = "baba"
	lazy val modules: Seq[Module] = TestModule.Module :: Nil
}
