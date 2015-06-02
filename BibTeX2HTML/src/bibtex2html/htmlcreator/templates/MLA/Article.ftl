
<#list ArticleList as ArticleData>
	<div>
		Last Name, First Name. "Article Title." Newspaper Name Publication Date: Page Numbers. Medium.
		${ArticleData.author}.
		"${ArticleData.title}."
		<em>${ArticleData.journal}</em>
		<#if ArticleData.month??>
			${ArticleData.month}-
		</#if>
		${ArticleData.year}
		<#if ArticleData.pages??>
			:${ArticleData.pages}
		</#if>.
		<#if ArticleData.crossref??>
			References: ${ArticleData.crossref}.
		</#if>
	</div>
</#list>