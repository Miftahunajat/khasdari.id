package com.groot.indonesia.grootapp.data

import com.groot.indonesia.grootapp.data.firebase.FirebaseDataManager
import com.groot.indonesia.grootapp.data.prefs.PreferenceHelper

/**
 * Created by miftahun on 3/8/18.
 */

interface DataManager : FirebaseDataManager, PreferenceHelper
