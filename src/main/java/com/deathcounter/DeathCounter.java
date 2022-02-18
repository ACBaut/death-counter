package com.deathcounter;

import lombok.Getter;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.Counter;
import net.runelite.client.util.QuantityFormatter;

import java.awt.image.BufferedImage;

class DeathCounter extends Counter
{
    @Getter
    private final int itemID;
    private final String name;

    DeathCounter(Plugin plugin, int itemID, int count, String name, BufferedImage image)
    {
        super(image, plugin, count);
        this.itemID = itemID;
        this.name = name;
    }

    @Override
    public String getText()
    {
        return QuantityFormatter.quantityToRSDecimalStack(getCount());
    }

    @Override
    public String getTooltip()
    {
        return "Deaths";
    }
}
