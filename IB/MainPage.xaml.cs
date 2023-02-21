using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;

using Windows.Foundation;
using Windows.Foundation.Collections;


using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;
using Windows.UI.Xaml.Documents;

using iText.Kernel.Pdf;
using iText.Layout;
using iText.Layout.Element;
using iText.Layout.Properties;
using Paragraph = iText.Layout.Element.Paragraph;

namespace IB
{

    public sealed partial class MainPage : Page
    {
        public MainPage()
        {
            this.InitializeComponent();

            // Must have write permissions to the path folder
            //PdfWriter writer = new PdfWriter("C:\\Users\\Admin\\Desktop\\testt\\demo.pdf");
            //PdfDocument pdf = new PdfDocument(writer);
            //Document document = new Document(pdf);
            //Paragraph header = new Paragraph("HEADER")
            //   .SetTextAlignment(TextAlignment.CENTER)
            //   .SetFontSize(20);

            //document.Add(header);
            //document.Close();

        }

    }

    public class ItemList
    {
        public string ItemDescription { get; set; }
        public double ItemCost { get; set; }
        public double ItemVatPer { get; set; }
        public double ItemVATCost { get; set; }
    }
}
