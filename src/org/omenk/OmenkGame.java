package org.omenk;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class OmenkGame implements ApplicationListener{
	
	 private Texture  druidTexture;           // #1
     private SpriteBatch  batch;               

	@Override
	public void create() {
		
		 druidTexture = new Texture(Gdx.files.internal("droid.png"));    // #3
         batch = new SpriteBatch();    
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void render() {
		
		 batch.begin();                                  // #5
         batch.draw(druidTexture, 0, 0);             // #6
         batch.end();    
		
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	
	}

	@Override
	public void dispose() {
	
	}

}
