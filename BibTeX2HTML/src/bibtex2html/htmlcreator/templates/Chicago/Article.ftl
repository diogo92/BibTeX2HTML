<#list ArticleList as ArticleData>
	<div>
		${ArticleData.author}.
		"${ArticleData.title}."
		<em>${ArticleData.journal}</em>,
		<#if ArticleData.month??>
			${ArticleData.month}-
		</#if>
		${ArticleData.year}.
		<#if ArticleData.note??>
			${ArticleData.note}.
		</#if>
		<#if ArticleData.crossref??>
			References: ${ArticleData.crossref}.
		</#if>
	</div>
</#list>