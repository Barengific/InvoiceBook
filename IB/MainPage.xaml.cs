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

using Microsoft.Data.Sqlite;

using System.Security.Permissions;
using System.Security;
using Windows.Services.Store;

namespace IB
{

    public sealed partial class MainPage : Page
    {
        public List<ItemssList> ItemLister { get; set; }
        public MainPage()
        {
            this.InitializeComponent();

            // Must have write permissions to the path folder
            //PdfWriter writer = new PdfWriter("D:\\Admino\\demo.pdf");
            //PdfDocument pdf = new PdfDocument(writer);
            //Document document = new Document(pdf);
            //Paragraph header = new Paragraph("HEADER")
            //   .SetFontSize(20);

            //document.Add(header);
            //document.Close();

            //LvUsers.Items.Add(new UsersList()
            //{
            //    PersonID = getUsers?.Response?.Data?.PersonList?.PersonInfoList?[i]?.PersonID.ToString(),
            //    PersonName = getUsers?.Response?.Data?.PersonList?.PersonInfoList?[i]?.PersonName,
            //    Bday = getUsers?.Response?.Data?.PersonList?.PersonInfoList?[i]?.Birthday,
            //    Gender = getUsers?.Response?.Data?.PersonList?.PersonInfoList?[i]?.Gender.ToString(),
            //    EmployeeID = getUsers?.Response?.Data?.PersonList?.PersonInfoList?[i]?.IdentificationList?[0]?.Number
            //});

            //ItemsLists.Items.Add(new ItemssList() {
            //    ItemDescription = "aaa",
            //    ItemQuantity = "bbbb",
            //    ItemPrice = "ccc",
            //    ItemVatPer = "dddd",
            //    ItemVATCost = "eee",
            //    ItemTotal = "fff"
            //});

            TermsList.Items.Add(new TermsList()
            {
                TermNumber = "aaa",
                TermDescription = "bbbbbbbbbbbbbbbb"
            });

            TermsList.Items.Add(new TermsList()
            {
                TermNumber = "tttt",
                TermDescription = "rrrrrr"
            });

        }
    private void BtnAddItem(object sender, RoutedEventArgs e)
        {
            string strDes = txtIDes.Text;
            string strQuan = txtIQuan.Text;
            string strPrice = txtIPrice.Text;
            string strVatP = txtIVatP.Text;
            string strVat = txtIVat.Text;
            string strTotal = txtITotal.Text;

            //ItemsLists.Items.Add(new ItemssList()
            //{
            //    ItemDescription = strDes,
            //    ItemQuantity= strQuan,
            //    ItemPrice = strPrice,
            //    ItemVatPer = strVatP,
            //    ItemVATCost = strVat,
            //    ItemTotal = strTotal
            //});


        }
        private void BtnAddTerms(object sender, RoutedEventArgs e)
        {
            string strTerms = txtTerms.Text;

        }
    }
    public class ItemssList
    {
        public string ItemDescription { get; set; }
        public string ItemQuantity { get; set; }
        public string ItemPrice { get; set; }
        public string ItemVatPer { get; set; }
        public string ItemVATCost { get; set; }
        public string ItemTotal { get; set; }

    }

    public class TermsList
    {
        public string TermNumber { get; set; }
        public string TermDescription { get; set; }
    }


}
