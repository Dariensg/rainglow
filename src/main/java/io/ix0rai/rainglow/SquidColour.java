package io.ix0rai.rainglow;

import net.minecraft.util.Identifier;

public enum SquidColour {
    BLUE(
            "blue",
            new Identifier("textures/entity/squid/glow_squid.png"),
            new RGB(0.6F, 1.0F, 0.8F),
            new RGB(0.08F, 0.4F, 0.4F),
            new RGB(204, 31, 102)
    ),
    RED(
            "red",
            new RGB(1.0F, 1.0F, 0.8F),
            new RGB(1.0F, 0.4F, 0.4F),
            new RGB(200, 0, 0)
    ),
    GREEN(
            "green",
            new RGB(0.6F, 1.0F, 0.8F),
            new RGB(0.08F, 1.0F, 0.4F),
            new RGB(0, 200, 0)
    ),
    PINK(
            "pink",
            new RGB(1.0F, 0.6F, 0.8F),
            new RGB(1.0F, 0.08F, 0.4F),
            new RGB(200, 0, 200)
    ),
    YELLOW(
            "yellow",
            new RGB(1.0F, 1.0F, 0.8F),
            new RGB(1.0F, 1.0F, 0.4F),
            new RGB(200, 200, 0)
    ),
    ORANGE(
            "orange",
            new RGB(1.0F, 1.0F, 0.8F),
            new RGB(1.0F, 0.4F, 0.4F),
            new RGB(200, 100, 0)
    ),
    INDIGO(
            "indigo",
            new RGB(0.6F, 1.0F, 0.8F),
            new RGB(0.08F, 0.4F, 1.0F),
            new RGB(0, 0, 200)
    ),
    PURPLE(
            "purple",
            new RGB(0.6F, 1.0F, 0.8F),
            new RGB(0.08F, 0.4F, 1.0F),
            new RGB(100, 0, 200)
    ),
    WHITE(
            "white",
            new RGB(1.0F, 1.0F, 1.0F),
            new RGB(1.0F, 1.0F, 1.0F),
            new RGB(200, 200, 200)
    );

    private final String id;
    private final Identifier texture;
    private final RGB passiveParticleRgb;
    private final RGB altPassiveParticleRgb;
    private final RGB inkRgb;

    SquidColour(String id, RGB passiveParticleRgb, RGB altPassiveParticleRgb, RGB inkRgb) {
        this(id, new Identifier("textures/entity/squid/" + id + ".png"), passiveParticleRgb, altPassiveParticleRgb, inkRgb);
    }

    SquidColour(String id, Identifier texture, RGB passiveParticleRgb, RGB altPassiveParticleRgb, RGB inkRgb) {
        this.id = id;
        this.texture = texture;
        this.passiveParticleRgb = passiveParticleRgb;
        this.altPassiveParticleRgb = altPassiveParticleRgb;
        this.inkRgb = inkRgb;
    }

    public String getId() {
        return this.id;
    }

    public Identifier getTexture() {
        return this.texture;
    }

    public RGB getPassiveParticleRgb() {
        return this.passiveParticleRgb;
    }

    public RGB getAltPassiveParticleRgb() {
        return this.altPassiveParticleRgb;
    }

    public RGB getInkRgb() {
        return this.inkRgb;
    }
}
