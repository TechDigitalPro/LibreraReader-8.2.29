package org.ebookdroid.common.settings.listeners;

import me.foobnix.model.AppBook;

public interface IBookSettingsChangeListener {

    void onBookSettingsChanged(AppBook oldSettings, AppBook newSettings, AppBook.Diff diff);

}
