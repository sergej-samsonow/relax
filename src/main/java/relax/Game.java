package relax;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game extends ApplicationAdapter {
	
	private SpriteBatch batch;
	
	private Texture img;

	private BitmapFont font;
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("Smiley.png");
		font = new BitmapFont();
		font.setColor(Color.RED);
	}
	
	@Override
	public void render() {
	    Gdx.gl.glClearColor( 1, 1, 1, 1 );
	    Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
		batch.begin();
		batch.draw(img, 0, 0);
		font.draw(batch, "Hello World", 10, 30);
		batch.end();
	}
	
	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}

}
