<#list ArticleList as ArticleData>
	<div>
		${ArticleData.author}.
		"${ArticleData.title}."
		<em>${ArticleData.journal}</em>,
		${ArticleData.year}.
		<#if ArticleData.note??>
			${ArticleData.note}.
		</#if>
		<#if ArticleData.crossref??>
			References: ${ArticleData.crossref}.
		</#if>
	</div>
</#list>