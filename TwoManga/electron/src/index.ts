// در بخش ایجاد پنجره (CreateWindow)
const mainWindow = new BrowserWindow({
  show: false,
  webPreferences: {
    nodeIntegration: true,
    contextIsolation: true,
  },
});

// ۱. مخفی کردن منوها برای پیدا نشدن URL
mainWindow.setMenuBarVisibility(false); 

// ۲. جلوگیری از ضبط صفحه در مک و ویندوز
mainWindow.setContentProtection(true); 

mainWindow.loadURL('https://MANGADREAM.CLICK');