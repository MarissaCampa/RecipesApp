package com.example.recipeapp.model
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Root(
    val kind: String,
    val url: Url,
    val queries: Queries,
    val context: Context,
    val searchInformation: SearchInformation,
    val items: List<Item>,
)

@Serializable
data class Url(
    val type: String,
    val template: String,
)

@Serializable
data class Queries(
    val request: List<Request>,
    val nextPage: List<NextPage>,
)

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
data class NextPage(
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
data class Context(
    val title: String,
)

@Serializable
data class SearchInformation(
    val searchTime: Double,
    val formattedSearchTime: String,
    val totalResults: String,
    val formattedTotalResults: String,
)

@Serializable
data class Item(
    val kind: String? = null,
    val title: String,
    val htmlTitle: String? = null,
    val link: String? = null,
    val displayLink: String? = null,
    val snippet: String,
    val htmlSnippet: String? = null,
    val cacheId: String? = null,
    val formattedUrl: String? = null,
    val htmlFormattedUrl: String? = null,
    val pagemap: Pagemap? = null,
)

@Serializable
data class Pagemap(
    @SerialName("cse_thumbnail")
    val cseThumbnail: List<CseThumbnail>? = null,
    val metatags: List<Metatag>,
    @SerialName("cse_image")
    val cseImage: List<CseImage>? = null,
    val hcard: List<Hcard>? = null,
    val videoobject: List<Videoobject>? = null,
    val speakablespecification: List<Speakablespecification>? = null,
    val listitem: List<Listitem>? = null,
    @SerialName("BreadcrumbList")
    val breadcrumbList: List<Listitem>? = null,
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
    val ogImage: String? = null,
    @SerialName("og:type")
    val ogType: String? = null,
    @SerialName("article:published_time")
    val articlePublishedTime: String? = null,
    @SerialName("og:image:width")
    val ogImageWidth: String? = null,
    @SerialName("og:site_name")
    val ogSiteName: String? = null,
    val author: String? = null,
    @SerialName("og:title")
    val ogTitle: String? = null,
    @SerialName("og:image:height")
    val ogImageHeight: String? = null,
    @SerialName("twitter:label1")
    val twitterLabel1: String? = null,
    @SerialName("slick:wpversion")
    val slickWpversion: String? = null,
    @SerialName("twitter:label2")
    val twitterLabel2: String? = null,
    @SerialName("og:image:type")
    val ogImageType: String? = null,
    @SerialName("slick:category")
    val slickCategory: String? = null,
    @SerialName("og:description")
    val ogDescription: String? = null,
    @SerialName("twitter:data1")
    val twitterData1: String? = null,
    @SerialName("twitter:data2")
    val twitterData2: String? = null,
    @SerialName("slick:group")
    val slickGroup: String? = null,
    @SerialName("pinterest-rich-pin")
    val pinterestRichPin: String? = null,
    @SerialName("article:modified_time")
    val articleModifiedTime: String? = null,
    val viewport: String? = null,
    @SerialName("slick:wppostid")
    val slickWppostid: String? = null,
    @SerialName("og:locale")
    val ogLocale: String? = null,
    @SerialName("og:url")
    val ogUrl: String? = null,
    @SerialName("slick:featured_image")
    val slickFeaturedImage: String? = null,
    @SerialName("p:domain_verify")
    val pDomainVerify: String? = null,
    @SerialName("twitter:card")
    val twitterCard: String? = null,
    @SerialName("msapplication-tileimage")
    val msapplicationTileimage: String? = null,
    @SerialName("twitter:creator")
    val twitterCreator: String? = null,
    @SerialName("twitter:image")
    val twitterImage: String? = null,
    @SerialName("article:publisher")
    val articlePublisher: String? = null,
    @SerialName("article_author")
    val articleAuthor: String? = null,
    @SerialName("twitter:site")
    val twitterSite: String? = null,
    @SerialName("twitter:title")
    val twitterTitle: String? = null,
    @SerialName("article_publisher")
    val articlePublisher2: String? = null,
    @SerialName("og:updated_time")
    val ogUpdatedTime: String? = null,
    @SerialName("article:author")
    val articleAuthor2: String? = null,
    @SerialName("fb:app_id")
    val fbAppId: String? = null,
    @SerialName("twitter:description")
    val twitterDescription: String? = null,
    @SerialName("theme-color")
    val themeColor: String? = null,
    @SerialName("sailthru.tags")
    val sailthruTags: String? = null,
    @SerialName("sailthru.contenttype")
    val sailthruContenttype: String? = null,
    val title: String? = null,
    @SerialName("next-head-count")
    val nextHeadCount: String? = null,
    @SerialName("msapplication-tap-highlight")
    val msapplicationTapHighlight: String? = null,
    @SerialName("sailthru.socialtitle")
    val sailthruSocialtitle: String? = null,
    @SerialName("parsely-section")
    val parselySection: String? = null,
    @SerialName("sailthru.date")
    val sailthruDate: String? = null,
    @SerialName("x-ua-compatible")
    val xUaCompatible: String? = null,
    val thumbnail: String? = null,
    @SerialName("article:section")
    val articleSection: String? = null,
    val m1: String? = null,
    val m2: String? = null,
    @SerialName("auto-publish")
    val autoPublish: String? = null,
    @SerialName("sailthru.image.thumb")
    val sailthruImageThumb: String? = null,
    @SerialName("sailthru.image.full")
    val sailthruImageFull: String? = null,
    @SerialName("article:opinion")
    val articleOpinion: String? = null,
    @SerialName("be:sdk")
    val beSdk: String? = null,
    @SerialName("be:norm_url")
    val beNormUrl: String? = null,
    @SerialName("be:capsule_url")
    val beCapsuleUrl: String? = null,
    @SerialName("be:api_dt")
    val beApiDt: String? = null,
    @SerialName("be:mod_dt")
    val beModDt: String? = null,
    @SerialName("be:timer")
    val beTimer: String? = null,
    val position: String? = null,
    @SerialName("be:orig_url")
    val beOrigUrl: String? = null,
    @SerialName("be:messages")
    val beMessages: String? = null,
    @SerialName("norton-safeweb-site-verification")
    val nortonSafewebSiteVerification: String? = null,
    val onesignal: String? = null,
    @SerialName("ahrefs-site-verification")
    val ahrefsSiteVerification: String? = null,
    @SerialName("msapplication-tilecolor")
    val msapplicationTilecolor: String? = null,
    @SerialName("facebook-domain-verification")
    val facebookDomainVerification: String? = null,
    @SerialName("msapplication-square70x70logo")
    val msapplicationSquare70x70logo: String? = null,
    @SerialName("msapplication-wide310x150logo")
    val msapplicationWide310x150logo: String? = null,
    @SerialName("msapplication-square310x310logo")
    val msapplicationSquare310x310logo: String? = null,
    @SerialName("msapplication-square150x150logo")
    val msapplicationSquare150x150logo: String? = null,
    @SerialName("fb:pages")
    val fbPages: String? = null,
    @SerialName("parsely-tags")
    val parselyTags: String? = null,
)

@Serializable
data class CseImage(
    val src: String,
)

@Serializable
data class Hcard(
    val fn: String,
    val nickname: String? = null,
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
    val item: String? = null,
    val name: String? = null,
    val position: String? = null,
)
