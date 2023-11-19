// app/src/main/java/com/example/recipeapp/model/Recipe.kt
package com.example.recipeapp.model
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Recipe(
    val kind: String = "",
    val title: String = "",
    val htmlTitle: String = "",
    val link: String = "",
    val displayLink: String = "",
    val snippet: String = "",
    val htmlSnippet: String = "",
    val cacheId: String? = "",
    val formattedUrl: String = "",
    val htmlFormattedUrl: String = ""
//    val pagemap: Pagemap,
)

@Serializable
data class Response(val results: List<Recipe>)

@Serializable
data class Request(
    val title: String,
    val totalResults: String,
    val searchTerms: String,
    val count: Long,
    val startIndex: Long,
    val inputEncoding: String,
    val outputEncoding: String,
    val safe: String,
    val cx: String,
)

@Serializable
data class Pagemap(
    @SerialName("cse_thumbnail")
    val cseThumbnail: List<CseThumbnail>?,
    val metatags: List<Metatag>,
    @SerialName("cse_image")
    val cseImage: List<CseImage>?,
    val hcard: List<Hcard>?,
    val videoobject: List<Videoobject>?,
    val speakablespecification: List<Speakablespecification>?,
    val listitem: List<Listitem>?,
//    @SerialName("BreadcrumbList")
//    val breadcrumbList: List<Map<String, Any>>?,
)

@Serializable
data class CseThumbnail(
    val src: String,
    val width: String,
    val height: String,
)

@Serializable
data class Metatag(
    @SerialName("og:image")
    val ogImage: String,
    @SerialName("og:type")
    val ogType: String?,
    @SerialName("article:published_time")
    val articlePublishedTime: String?,
    @SerialName("og:image:width")
    val ogImageWidth: String?,
    @SerialName("og:site_name")
    val ogSiteName: String?,
    val author: String?,
    @SerialName("og:title")
    val ogTitle: String,
    @SerialName("og:image:height")
    val ogImageHeight: String?,
    @SerialName("twitter:label1")
    val twitterLabel1: String?,
    @SerialName("slick:wpversion")
    val slickWpversion: String?,
    @SerialName("twitter:label2")
    val twitterLabel2: String?,
    @SerialName("og:image:type")
    val ogImageType: String?,
    @SerialName("slick:category")
    val slickCategory: String?,
    @SerialName("og:description")
    val ogDescription: String,
    @SerialName("twitter:data1")
    val twitterData1: String?,
    @SerialName("twitter:data2")
    val twitterData2: String?,
    @SerialName("slick:group")
    val slickGroup: String?,
    @SerialName("pinterest-rich-pin")
    val pinterestRichPin: String?,
    @SerialName("article:modified_time")
    val articleModifiedTime: String?,
    val viewport: String,
    @SerialName("slick:wppostid")
    val slickWppostid: String?,
    @SerialName("og:locale")
    val ogLocale: String?,
    @SerialName("og:url")
    val ogUrl: String?,
    @SerialName("slick:featured_image")
    val slickFeaturedImage: String?,
    @SerialName("p:domain_verify")
    val pDomainVerify: String?,
    @SerialName("twitter:card")
    val twitterCard: String?,
    @SerialName("msapplication-tileimage")
    val msapplicationTileimage: String?,
    @SerialName("twitter:creator")
    val twitterCreator: String?,
    @SerialName("twitter:image")
    val twitterImage: String?,
    @SerialName("article:publisher")
    val articlePublisher: String?,
    @SerialName("article_author")
    val articleAuthor: String?,
    @SerialName("twitter:site")
    val twitterSite: String?,
    @SerialName("twitter:title")
    val twitterTitle: String?,
    @SerialName("article_publisher")
    val articlePublisher2: String?,
    @SerialName("og:updated_time")
    val ogUpdatedTime: String?,
    @SerialName("article:author")
    val articleAuthor2: String?,
    @SerialName("fb:app_id")
    val fbAppId: String?,
    @SerialName("twitter:description")
    val twitterDescription: String?,
    @SerialName("theme-color")
    val themeColor: String?,
    @SerialName("sailthru.tags")
    val sailthruTags: String?,
    @SerialName("sailthru.contenttype")
    val sailthruContenttype: String?,
    val title: String?,
    @SerialName("next-head-count")
    val nextHeadCount: String?,
    @SerialName("msapplication-tap-highlight")
    val msapplicationTapHighlight: String?,
    @SerialName("sailthru.socialtitle")
    val sailthruSocialtitle: String?,
    @SerialName("parsely-section")
    val parselySection: String?,
    @SerialName("sailthru.date")
    val sailthruDate: String?,
    @SerialName("x-ua-compatible")
    val xUaCompatible: String?,
    val thumbnail: String?,
    @SerialName("article:section")
    val articleSection: String?,
    val m1: String?,
    val m2: String?,
    @SerialName("auto-publish")
    val autoPublish: String?,
    @SerialName("sailthru.image.thumb")
    val sailthruImageThumb: String?,
    @SerialName("sailthru.image.full")
    val sailthruImageFull: String?,
    @SerialName("article:opinion")
    val articleOpinion: String?,
    @SerialName("be:sdk")
    val beSdk: String?,
    @SerialName("be:norm_url")
    val beNormUrl: String?,
    @SerialName("be:capsule_url")
    val beCapsuleUrl: String?,
    @SerialName("be:api_dt")
    val beApiDt: String?,
    @SerialName("be:mod_dt")
    val beModDt: String?,
    @SerialName("be:timer")
    val beTimer: String?,
    val position: String?,
    @SerialName("be:orig_url")
    val beOrigUrl: String?,
    @SerialName("be:messages")
    val beMessages: String?,
    @SerialName("norton-safeweb-site-verification")
    val nortonSafewebSiteVerification: String?,
    val onesignal: String?,
    @SerialName("ahrefs-site-verification")
    val ahrefsSiteVerification: String?,
    @SerialName("msapplication-tilecolor")
    val msapplicationTilecolor: String?,
    @SerialName("facebook-domain-verification")
    val facebookDomainVerification: String?,
    @SerialName("msapplication-square70x70logo")
    val msapplicationSquare70x70logo: String?,
    @SerialName("msapplication-wide310x150logo")
    val msapplicationWide310x150logo: String?,
    @SerialName("msapplication-square310x310logo")
    val msapplicationSquare310x310logo: String?,
    @SerialName("msapplication-square150x150logo")
    val msapplicationSquare150x150logo: String?,
    @SerialName("fb:pages")
    val fbPages: String?,
    @SerialName("parsely-tags")
    val parselyTags: String?,
)

@Serializable
data class CseImage(
    val src: String,
)

@Serializable
data class Hcard(
    val fn: String,
    val nickname: String?,
)

@Serializable
data class Videoobject(
    val contenturl: String,
    val uploaddate: String,
    val name: String,
    val description: String,
    val thumbnailurl: String,
)

@Serializable
data class Speakablespecification(
    val cssselector: String,
)

@Serializable
data class Listitem(
    val item: String,
    val name: String,
    val position: String,
)
