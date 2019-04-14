package com.example.testapplication.service.model;

import java.util.ArrayList;

public class CateoryResponse {
//
//    Products products;
//
//    public Products getProducts() {
//        return products;
//    }
//
//    public void setProducts(Products products) {
//        this.products = products;
//    }
//
//    public class Products {
//        private String title;
//        private String body_html;
//        private ArrayList<Images> images;
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public String getBody_html() {
//            return body_html;
//        }
//
//        public void setBody_html(String body_html) {
//            this.body_html = body_html;
//        }
//
//        public ArrayList<Images> getImages() {
//            return images;
//        }
//
//        public void setImages(ArrayList<Images> images) {
//            this.images = images;
//        }
//    }
//
//    public class Images{
//        private String src;
//
//    }

    private Products[] products;

    public Products[] getProducts ()
    {
        return products;
    }

    public void setProducts (Products[] products)
    {
        this.products = products;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [products = "+products+"]";
    }

    public class Products {
        private Image image;

        private String body_html;

        private Images[] images;

        private String created_at;

        private String handle;

        private Variants[] variants;

        private String title;

        private String tags;

        private String published_scope;

        private String product_type;

        private String template_suffix;

        private String updated_at;

        private String vendor;

        private String admin_graphql_api_id;

        private Options[] options;

        private String id;

        private String published_at;

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }

        public String getBody_html() {
            return body_html;
        }

        public void setBody_html(String body_html) {
            this.body_html = body_html;
        }

        public Images[] getImages() {
            return images;
        }

        public void setImages(Images[] images) {
            this.images = images;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getHandle() {
            return handle;
        }

        public void setHandle(String handle) {
            this.handle = handle;
        }

        public Variants[] getVariants() {
            return variants;
        }

        public void setVariants(Variants[] variants) {
            this.variants = variants;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getPublished_scope() {
            return published_scope;
        }

        public void setPublished_scope(String published_scope) {
            this.published_scope = published_scope;
        }

        public String getProduct_type() {
            return product_type;
        }

        public void setProduct_type(String product_type) {
            this.product_type = product_type;
        }

        public String getTemplate_suffix() {
            return template_suffix;
        }

        public void setTemplate_suffix(String template_suffix) {
            this.template_suffix = template_suffix;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public String getAdmin_graphql_api_id() {
            return admin_graphql_api_id;
        }

        public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
            this.admin_graphql_api_id = admin_graphql_api_id;
        }

        public Options[] getOptions() {
            return options;
        }

        public void setOptions(Options[] options) {
            this.options = options;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPublished_at() {
            return published_at;
        }

        public void setPublished_at(String published_at) {
            this.published_at = published_at;
        }

        @Override
        public String toString() {
            return "ClassPojo [image = " + image + ", body_html = " + body_html + ", images = " + images + ", created_at = " + created_at + ", handle = " + handle + ", variants = " + variants + ", title = " + title + ", tags = " + tags + ", published_scope = " + published_scope + ", product_type = " + product_type + ", template_suffix = " + template_suffix + ", updated_at = " + updated_at + ", vendor = " + vendor + ", admin_graphql_api_id = " + admin_graphql_api_id + ", options = " + options + ", id = " + id + ", published_at = " + published_at + "]";
        }
    }

    public class Image
    {
        private String updated_at;

        private String src;

        private String product_id;

        private String admin_graphql_api_id;

        private String alt;

        private String width;

        private String created_at;

        private String[] variant_ids;

        private String id;

        private String position;

        private String height;

        public String getUpdated_at ()
        {
            return updated_at;
        }

        public void setUpdated_at (String updated_at)
        {
            this.updated_at = updated_at;
        }

        public String getSrc ()
        {
            return src;
        }

        public void setSrc (String src)
        {
            this.src = src;
        }

        public String getProduct_id ()
        {
            return product_id;
        }

        public void setProduct_id (String product_id)
        {
            this.product_id = product_id;
        }

        public String getAdmin_graphql_api_id ()
        {
            return admin_graphql_api_id;
        }

        public void setAdmin_graphql_api_id (String admin_graphql_api_id)
        {
            this.admin_graphql_api_id = admin_graphql_api_id;
        }

        public String getAlt ()
    {
        return alt;
    }

        public void setAlt (String alt)
        {
            this.alt = alt;
        }

        public String getWidth ()
        {
            return width;
        }

        public void setWidth (String width)
        {
            this.width = width;
        }

        public String getCreated_at ()
        {
            return created_at;
        }

        public void setCreated_at (String created_at)
        {
            this.created_at = created_at;
        }

        public String[] getVariant_ids ()
        {
            return variant_ids;
        }

        public void setVariant_ids (String[] variant_ids)
        {
            this.variant_ids = variant_ids;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getPosition ()
        {
            return position;
        }

        public void setPosition (String position)
        {
            this.position = position;
        }

        public String getHeight ()
        {
            return height;
        }

        public void setHeight (String height)
        {
            this.height = height;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [updated_at = "+updated_at+", src = "+src+", product_id = "+product_id+", admin_graphql_api_id = "+admin_graphql_api_id+", alt = "+alt+", width = "+width+", created_at = "+created_at+", variant_ids = "+variant_ids+", id = "+id+", position = "+position+", height = "+height+"]";
        }
    }

    public class Images
    {
        private String updated_at;

        private String src;

        private String product_id;

        private String admin_graphql_api_id;

        private String alt;

        private String width;

        private String created_at;

        private String[] variant_ids;

        private String id;

        private String position;

        private String height;

        public String getUpdated_at ()
        {
            return updated_at;
        }

        public void setUpdated_at (String updated_at)
        {
            this.updated_at = updated_at;
        }

        public String getSrc ()
        {
            return src;
        }

        public void setSrc (String src)
        {
            this.src = src;
        }

        public String getProduct_id ()
        {
            return product_id;
        }

        public void setProduct_id (String product_id)
        {
            this.product_id = product_id;
        }

        public String getAdmin_graphql_api_id ()
        {
            return admin_graphql_api_id;
        }

        public void setAdmin_graphql_api_id (String admin_graphql_api_id)
        {
            this.admin_graphql_api_id = admin_graphql_api_id;
        }

        public String getAlt ()
    {
        return alt;
    }

        public void setAlt (String alt)
        {
            this.alt = alt;
        }

        public String getWidth ()
        {
            return width;
        }

        public void setWidth (String width)
        {
            this.width = width;
        }

        public String getCreated_at ()
        {
            return created_at;
        }

        public void setCreated_at (String created_at)
        {
            this.created_at = created_at;
        }

        public String[] getVariant_ids ()
        {
            return variant_ids;
        }

        public void setVariant_ids (String[] variant_ids)
        {
            this.variant_ids = variant_ids;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getPosition ()
        {
            return position;
        }

        public void setPosition (String position)
        {
            this.position = position;
        }

        public String getHeight ()
        {
            return height;
        }

        public void setHeight (String height)
        {
            this.height = height;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [updated_at = "+updated_at+", src = "+src+", product_id = "+product_id+", admin_graphql_api_id = "+admin_graphql_api_id+", alt = "+alt+", width = "+width+", created_at = "+created_at+", variant_ids = "+variant_ids+", id = "+id+", position = "+position+", height = "+height+"]";
        }
    }

    public class Options
    {
        private String product_id;

        private String[] values;

        private String name;

        private String id;

        private String position;

        public String getProduct_id ()
        {
            return product_id;
        }

        public void setProduct_id (String product_id)
        {
            this.product_id = product_id;
        }

        public String[] getValues ()
        {
            return values;
        }

        public void setValues (String[] values)
        {
            this.values = values;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getPosition ()
        {
            return position;
        }

        public void setPosition (String position)
        {
            this.position = position;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [product_id = "+product_id+", values = "+values+", name = "+name+", id = "+id+", position = "+position+"]";
        }
    }


    public class Variants
    {
        private String inventory_management;

        private String old_inventory_quantity;

        private String requires_shipping;

        private String created_at;

        private String title;

        private String updated_at;

        private String inventory_item_id;

        private String price;

        private String product_id;

        private String  option3;

        private String option1;

        private String id;

        private String  option2;

        private String sku;

        private String grams;

        private String barcode;

        private String inventory_quantity;

        private String  compare_at_price;

        private String fulfillment_service;

        private String taxable;

        private String weight;

        private String inventory_policy;

        private String weight_unit;

        private String admin_graphql_api_id;

        private String position;

        private String  image_id;

        public String getInventory_management ()
        {
            return inventory_management;
        }

        public void setInventory_management (String inventory_management)
        {
            this.inventory_management = inventory_management;
        }

        public String getOld_inventory_quantity ()
        {
            return old_inventory_quantity;
        }

        public void setOld_inventory_quantity (String old_inventory_quantity)
        {
            this.old_inventory_quantity = old_inventory_quantity;
        }

        public String getRequires_shipping ()
        {
            return requires_shipping;
        }

        public void setRequires_shipping (String requires_shipping)
        {
            this.requires_shipping = requires_shipping;
        }

        public String getCreated_at ()
        {
            return created_at;
        }

        public void setCreated_at (String created_at)
        {
            this.created_at = created_at;
        }

        public String getTitle ()
        {
            return title;
        }

        public void setTitle (String title)
        {
            this.title = title;
        }

        public String getUpdated_at ()
        {
            return updated_at;
        }

        public void setUpdated_at (String updated_at)
        {
            this.updated_at = updated_at;
        }

        public String getInventory_item_id ()
        {
            return inventory_item_id;
        }

        public void setInventory_item_id (String inventory_item_id)
        {
            this.inventory_item_id = inventory_item_id;
        }

        public String getPrice ()
        {
            return price;
        }

        public void setPrice (String price)
        {
            this.price = price;
        }

        public String getProduct_id ()
        {
            return product_id;
        }

        public void setProduct_id (String product_id)
        {
            this.product_id = product_id;
        }

        public String  getOption3 ()
    {
        return option3;
    }

        public void setOption3 (String  option3)
        {
            this.option3 = option3;
        }

        public String getOption1 ()
        {
            return option1;
        }

        public void setOption1 (String option1)
        {
            this.option1 = option1;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String  getOption2 ()
    {
        return option2;
    }

        public void setOption2 (String  option2)
        {
            this.option2 = option2;
        }

        public String getSku ()
        {
            return sku;
        }

        public void setSku (String sku)
        {
            this.sku = sku;
        }

        public String getGrams ()
        {
            return grams;
        }

        public void setGrams (String grams)
        {
            this.grams = grams;
        }

        public String getBarcode ()
        {
            return barcode;
        }

        public void setBarcode (String barcode)
        {
            this.barcode = barcode;
        }

        public String getInventory_quantity ()
        {
            return inventory_quantity;
        }

        public void setInventory_quantity (String inventory_quantity)
        {
            this.inventory_quantity = inventory_quantity;
        }

        public String  getCompare_at_price ()
    {
        return compare_at_price;
    }

        public void setCompare_at_price (String  compare_at_price)
        {
            this.compare_at_price = compare_at_price;
        }

        public String getFulfillment_service ()
        {
            return fulfillment_service;
        }

        public void setFulfillment_service (String fulfillment_service)
        {
            this.fulfillment_service = fulfillment_service;
        }

        public String getTaxable ()
        {
            return taxable;
        }

        public void setTaxable (String taxable)
        {
            this.taxable = taxable;
        }

        public String getWeight ()
        {
            return weight;
        }

        public void setWeight (String weight)
        {
            this.weight = weight;
        }

        public String getInventory_policy ()
        {
            return inventory_policy;
        }

        public void setInventory_policy (String inventory_policy)
        {
            this.inventory_policy = inventory_policy;
        }

        public String getWeight_unit ()
        {
            return weight_unit;
        }

        public void setWeight_unit (String weight_unit)
        {
            this.weight_unit = weight_unit;
        }

        public String getAdmin_graphql_api_id ()
        {
            return admin_graphql_api_id;
        }

        public void setAdmin_graphql_api_id (String admin_graphql_api_id)
        {
            this.admin_graphql_api_id = admin_graphql_api_id;
        }

        public String getPosition ()
        {
            return position;
        }

        public void setPosition (String position)
        {
            this.position = position;
        }

        public String  getImage_id ()
    {
        return image_id;
    }

        public void setImage_id (String  image_id)
        {
            this.image_id = image_id;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [inventory_management = "+inventory_management+", old_inventory_quantity = "+old_inventory_quantity+", requires_shipping = "+requires_shipping+", created_at = "+created_at+", title = "+title+", updated_at = "+updated_at+", inventory_item_id = "+inventory_item_id+", price = "+price+", product_id = "+product_id+", option3 = "+option3+", option1 = "+option1+", id = "+id+", option2 = "+option2+", sku = "+sku+", grams = "+grams+", barcode = "+barcode+", inventory_quantity = "+inventory_quantity+", compare_at_price = "+compare_at_price+", fulfillment_service = "+fulfillment_service+", taxable = "+taxable+", weight = "+weight+", inventory_policy = "+inventory_policy+", weight_unit = "+weight_unit+", admin_graphql_api_id = "+admin_graphql_api_id+", position = "+position+", image_id = "+image_id+"]";
        }
    }


}
