package net.emersoncoskey.cardboard.datagen.tag

import net.minecraft.tags.Tag

case class TagAssignment[A](obj: A, target: Seq[Tag.Named[A]])