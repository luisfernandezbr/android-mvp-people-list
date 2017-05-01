package br.com.mobiplus.simplerecylerview.util;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class TypefaceUtil {

	static Map<String, Typeface> typefaces = new HashMap<>();

	public static Typeface getTypeface(Context context, String textStyle) {
		Typeface typeface = null;

		if (context != null) {
			typeface = loadTypeface(context, textStyle);
		}

		return typeface;
	}

	public static void defineTextStyle(Context context, TextView textView, String textStyle) {
		Typeface typeface;

		if (context != null) {

			if (textView != null) {
				typeface = loadTypeface(context, textStyle);

				textView.setTypeface(typeface);
			}
		}
	}

	private static Typeface loadTypeface(Context context, String textStyle) {
		Typeface typeface = typefaces.get(textStyle);

		if (typeface == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), textStyle);
            typefaces.put(textStyle, typeface);
        }

		return typeface;
	}
}
